package com.example.yq.ioc.bean.factorybean;

import com.example.yq.ioc.bean.constructor.UserModel;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

public class UserFactoryBean implements FactoryBean<UserModel> {
    int count = 1;
    @Nullable
    @Override
    public UserModel getObject() throws Exception { //@1
        UserModel userModel = new UserModel();
        userModel.setName("我是通过FactoryBean创建的第"+count+++ "对象");//@4
        return userModel;
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return UserModel.class; //@2
    }

    @Override
    public boolean isSingleton() {
        return true; //@3
    }
}
