package com.example.yq.ioc.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.request.RequestScope;
import com.example.yq.ioc.initproperty.MyClassPathXmlApplicationContext;
import java.util.concurrent.TimeUnit;

/**
 * @author yangqiang
 * @create 2022-06-16 10:34
 */
public class ScopeTest {

	@Test
	public void singletonTest(){
		ApplicationContext context =
				new MyClassPathXmlApplicationContext("beans_scope.xml");
		SingletonBean singletonBean = context.getBean(SingletonBean.class);

	}


	@Test
	public void prototypeTest(){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans_scope.xml");
		PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);

	}

    /**
	 * bean的生命周期为线程级别
	 * */
	@Test
	public void myScopeTest() throws InterruptedException {
		ClassPathXmlApplicationContext context =
				new MyClassPathXmlApplicationContext("beans_scope.xml");
		PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);

		//向容器中注册自定义的scope
		context.getBeanFactory().registerScope(MyScope.THREAD_SCOPE, new MyScope());//@1
		context.getBeanFactory().registerScope("request",new RequestScope());
		//使用容器获取bean
		for (int i = 0; i < 2; i++) { //@2
			new Thread(() -> {
				System.out.println(Thread.currentThread() + "," + context.getBean("threadBean"));
				System.out.println(Thread.currentThread() + "," + context.getBean("threadBean"));
			}).start();
			TimeUnit.SECONDS.sleep(1);
		}
	}
}
