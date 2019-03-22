package com.xiaoz.service;

import com.xiaoz.dao.IUserDao;
import com.xiaoz.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//@Component("userService")
@Service("myUserService")
public class UserServiceImpl implements IUserService{
    @Autowired
    private IUserDao userDao;

    private String name;

    public String getName() {
        return name;
    }

    public UserServiceImpl() {
        System.out.println("UserServiceImpl调用了");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add() {
        System.out.println("创建用户..." + name);
    }

    @Override
    public void add(User user) {
        System.out.println("service 添加用户："+user);
        //调用dao
        userDao.add(user);
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
