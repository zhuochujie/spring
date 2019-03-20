package com.xiaoz.service;

public class UserServiceFactory1 {
    public static IUserService createUserService(){
        return new UserServiceImpl();
    }
}
