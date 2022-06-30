package com.example.yq.ioc.conversionservice;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author yangqiang
 * @create 2022-06-30 16:47
 */
@Component
public class MyConverter implements Converter<String,Person> {
	@Override
	public Person convert(String source) {
		System.out.println("MyConverter: "+source);
		return new Person(Integer.valueOf(source.split("-")[0]),source.split("-")[1]);
	}
}
