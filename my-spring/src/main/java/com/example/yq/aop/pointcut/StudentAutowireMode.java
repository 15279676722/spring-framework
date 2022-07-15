package com.example.yq.aop.pointcut;


import com.example.yq.ioc.bean.constructor.UserModel;
import com.example.yq.ioc.lookup.annotation.Apple;
import com.example.yq.ioc.lookup.annotation.Banana;
import com.example.yq.ioc.lookup.annotation.Fruit;
import com.example.yq.ioc.propertyeditor.Job;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;

import java.beans.ConstructorProperties;

/**
 * 自动注入模型
 * @author yangqiang
 * @create 2022-06-13 16:54
 */
public class StudentAutowireMode{


	private Apple apple;

	private String name;

	private Long id;

	private Integer age;

	private Job job;

	private Banana banana2;

    private String path;

	private Banana banana;

	private Banana banana3;



	private Banana banana4;

	private UserModel userModel;



	public void say() {
		System.out.println("这是一个苦逼的程序员");
		((Person) AopContext.currentProxy()).sayAfter();

	}

	public void sayAfter() {
		System.out.println("这是一个苦逼的程序员sayAfter");
	}


	public StudentAutowireMode() {
	}

	/**
	 * @Autowired 只能作用于一个构造方法上面
	 * @ConstructorProperties({"name1","id1"})
	 *  定制xml和参数的映射 在xml中就可以配置name1 这个字段 并没有什么用不建议用
	 * */
	@ConstructorProperties({"apple","name1","id1","age","job"})
	public StudentAutowireMode(Apple apple, String name, Long id, Integer age, Job job) {
		this.apple = apple;
		this.name = name;
		this.id = id;
		this.age = age;
		this.job = job;
	}




	@Override
	public String toString() {
		return "StudentAutowireMode{" +
				", apple=" + apple +
				", name='" + name + '\'' +
				", id=" + id +
				", age=" + age +
				", job=" + job +
				", banana2=" + banana2 +
				", path='" + path + '\'' +
				", banana=" + banana +
				", banana3=" + banana3 +
				", banana4=" + banana4 +
				'}';
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
		return banana;
	}

	public void setBanana(Banana banana) {
		this.banana = banana;
	}

	public Banana getBanana3() {
		return banana3;
	}

	public Banana getBanana4() {
		return banana4;
	}

	public void setBanana3(Banana banana3) {
		this.banana3 = banana3;
	}

	public void setBanana4(Banana banana4) {
		this.banana4 = banana4;
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}
}
