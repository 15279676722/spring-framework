package com.example.yq.ioc.bean.staticfactory;

import com.example.yq.ioc.bean.constructor.UserModel;


public class UserStaticFactory {
    /**
     * 静态无参方法创建UserModel
     *
     * @return
     */
    public static UserModel buildUser1() {
        System.out.println(UserStaticFactory.class + ".buildUser1()");
        UserModel userModel = new UserModel();
        userModel.setName("我是无参静态构造方法创建的!");
        return userModel;
    }
    /**
     * 静态有参方法创建UserModel
     *
     * @param name 名称
     * @param age  年龄
     * @return
     */
    public static UserModel buildUser2(String name, int age) {
        System.out.println(UserStaticFactory.class + ".buildUser2()");
        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setAge(age);
        return userModel;
    }
}
