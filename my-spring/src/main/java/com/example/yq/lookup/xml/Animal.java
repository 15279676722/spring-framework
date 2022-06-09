package com.example.yq.lookup.xml;

/**
 * @author yangqiang
 * @create 2022-06-08 21:55
 */
public abstract class Animal {
	void eat(){

	  };
     abstract Animal getAnimal();
     public void print(){
		 Animal animal = getAnimal();
		 animal.eat();
	 }
}
