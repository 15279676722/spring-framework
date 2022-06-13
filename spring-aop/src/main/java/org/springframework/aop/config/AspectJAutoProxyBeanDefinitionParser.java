/*
 * Copyright 2002-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.aop.config;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.TypedStringValue;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.lang.Nullable;

/**
 * {@link BeanDefinitionParser} for the {@code aspectj-autoproxy} tag,
 * enabling the automatic application of @AspectJ-style aspects found in
 * the {@link org.springframework.beans.factory.BeanFactory}.
 *
 * @author Rob Harrop
 * @author Juergen Hoeller
 * @since 2.0
 */
class AspectJAutoProxyBeanDefinitionParser implements BeanDefinitionParser {
    //	解析<aop:aspectj-autoproxy/>
	@Override
	@Nullable
	public BeanDefinition parse(Element element, ParserContext parserContext) {
		AopNamespaceUtils.registerAspectJAnnotationAutoProxyCreatorIfNecessary(parserContext, element);
		// 2、处理子标签<aop:include/>， 指定@Aspect类，支持正则表达式，符合该表达式的切面类才会被应用// 1、注册AnnotationAwareAspectJAutoProxyCreator
		extendBeanDefinition(element, parserContext);
		return null;
	}

	private void extendBeanDefinition(Element element, ParserContext parserContext) {
		// 获取前面注册的AnnotationAwareAspectJAutoProxyCreator对应的BeanDefinition
		BeanDefinition beanDef =
				parserContext.getRegistry().getBeanDefinition(AopConfigUtils.AUTO_PROXY_CREATOR_BEAN_NAME);
		// 解析当前标签的子标签
		if (element.hasChildNodes()) {
			addIncludePatterns(element, parserContext, beanDef);
		}
	}

	// 解析子标签中的name属性，其可以有多个，这个name属性最终会被添加到
	// AnnotationAwareAspectJAutoProxyCreator的includePatterns属性中，
	// Spring在判断一个类是否需要进行代理的时候会判断当前bean的名称是否与includePatterns中的
	// 正则表达式相匹配，如果不匹配，则不进行代理
	private void addIncludePatterns(Element element, ParserContext parserContext, BeanDefinition beanDef) {
		ManagedList<TypedStringValue> includePatterns = new ManagedList<>();
		NodeList childNodes = element.getChildNodes();
		for (int i = 0; i < childNodes.getLength(); i++) {
			Node node = childNodes.item(i);
			if (node instanceof Element includeElement) {
				// 解析子标签中的name属性
				TypedStringValue valueHolder = new TypedStringValue(includeElement.getAttribute("name"));
				valueHolder.setSource(parserContext.extractSource(includeElement));
				includePatterns.add(valueHolder);
			}
		}
		// 将解析到的name属性设置到AnnotationAwareAspectJAutoProxyCreator
		// 的includePatterns属性中
		if (!includePatterns.isEmpty()) {
			includePatterns.setSource(parserContext.extractSource(element));
			beanDef.getPropertyValues().add("includePatterns", includePatterns);
		}
	}

}
