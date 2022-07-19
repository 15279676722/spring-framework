package com.example.yq.aop.pointcut;


import com.example.yq.ioc.lookup.annotation.Apple;
import com.example.yq.ioc.lookup.annotation.Banana;
import com.example.yq.ioc.lookup.annotation.Fruit;
import com.example.yq.ioc.propertyeditor.Job;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.beans.ConstructorProperties;

/**
 * @author yangqiang
 * @create 2022-06-13 16:54
 */
public class Student extends MyAware implements Person, InitializingBean {

	private Fruit fruit;

	private Apple apple;

	private String name;

	private Long id;

	private Integer age;

	private Job job;

	@Autowired
	private Banana banana2;

	@Autowired
	@Qualifier(value = "banana2")
	private Banana banana6;

	@Value("${PATH}")
	private String path;

	/**
	 * name :指定注入的beanName
	 * 如果@Resource有设置name的话 isDefaultName 为false 根据设置的name来进行注入 没有这个beanName会报错
	 * 如果不设置 name的话 没有对应的beanName会对Type进行注入
	 * <p>
	 * 所以@Resource 是byName 再byType
	 * 如果指定了name属性就是byName 没有报错
	 */
	@Resource(name = "banana5")
	private Banana banana5;

	public Banana getBanana5() {
		return banana5;
	}

	public void setBanana5(Banana banana5) {
		this.banana5 = banana5;
	}

	private Banana banana3;

	/**
	 * @Autowired 作用于方法时 先byType 有多个时 byName 取的是参数的 banana3 beanName
	 * 和@Resource不一样
	 */
	@Autowired
	private void setBanana3(Banana banana3) {
		this.banana3 = banana3;
	}


	private Banana banana4;


	/**
	 * @Resource 作用在方法时 注入的是对应的方法名对应的beanName setBanana4->banana4
	 */
	@Resource
	private void setBanana4(Banana banana) {
		this.banana4 = banana;
	}

	@Override
	public void say() {
		System.out.println("这是一个苦逼的程序员");
		((Person) AopContext.currentProxy()).sayAfter();
	}

	@Override
	public void sayAfter() {
		System.out.println("这是一个苦逼的程序员sayAfter");
	}

	/**
	 * 被LookUp 或者Replaced修饰的bean 在创建bean的时候都会生成一个代理对象
	 * 代理对象在执行LookUp或者Replaced修饰的方法是会特殊处理
	 */
//	@Lookup(value = "banana")
	Fruit getFruit() {
		return null;
	}

	public Student() {

	}

	public Student(Fruit fruit) {
		this.fruit = fruit;
	}


	//@Autowired
	public Student(Apple apple, String name) {
		this.apple = apple;
	}

	/**
	 * @Autowired 只能作用于一个构造方法上面
	 * @ConstructorProperties({"name1","id1"}) 定制xml和参数的映射 在xml中就可以配置name1 这个字段 并没有什么用不建议用
	 */
	@Autowired
	@ConstructorProperties({"apple", "name1", "id1", "age"})
	public Student(Apple apple, String name, Long id, Integer age) {
		this.apple = apple;
		this.name = name;
		this.id = id;
		this.age = age;
	}


	@PostConstruct
	public void testPostConstruct() {
		System.out.println("Student testPostConstruct");
	}
    public void initMethod(){
		System.out.println("Student initMethod()");
	}
	@PreDestroy
	public void testPreDestroy() {
		System.out.println("Student testPreDestroy");
	}
	public void destroyMethod(){
		System.out.println("Student destroyMethod()");
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Banana getBanana2() {
		return banana2;
	}

	public void setBanana2(Banana banana2) {
		this.banana2 = banana2;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Banana getBanana() {
		return banana5;
	}

	public void setBanana(Banana banana) {
		this.banana5 = banana;
	}

	public Banana getBanana3() {
		return banana3;
	}

	public Banana getBanana4() {
		return banana4;
	}


	@Override
	public String toString() {
		return "Student{" +
				"fruit=" + fruit +
				", apple=" + apple +
				", name='" + name + '\'' +
				", id=" + id +
				", age=" + age +
				", job=" + job +
				", banana2=" + banana2 +
				", banana6=" + banana6 +
				", path='" + path + '\'' +
				", banana5=" + banana5 +
				", banana3=" + banana3 +
				", banana4=" + banana4 +
				'}';
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("student afterPropertiesSet()");
	}
}
