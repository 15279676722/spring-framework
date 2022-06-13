package com.example.yq.ioc.lookup.xml;

/**
 * @author yangqiang
 * @create 2022-06-08 21:55
 */
public abstract class Animal {
	void eat() {
	};

	/**
	 * 在xml中通过 <lookup-method/> 标签进行配置 把bean dog 注入进来
	 * 使得调用getAnimal方法的时候会默认返回一个 dog对象
	 */
	Animal getAnimal() {
		return null;
	};

	public void print() {
		Animal animal = getAnimal();
		animal.eat();
	}
}
