package com.example.yq.lookup.xml;

/**
 * @author yangqiang
 * @create 2022-06-08 21:57
 */
public class Cat extends Animal{
	@Override
	void eat() {
		System.out.println("猫吃老鼠");
	}

	@Override
	Animal getAnimal() {
		return this;
	}


}
