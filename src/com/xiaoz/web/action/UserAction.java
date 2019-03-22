package com.xiaoz.web.action;

import com.xiaoz.model.User;
import com.xiaoz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.annotation.Resources;

@Controller
@Scope("prototype")
public class UserAction {
    @Autowired//spring自动注入userService的值
    //@Qualifier("myUserService")//根据指定的id注入属性(用的比较少)

    //@Resource(name = "myUserService")//等同于上面两行代码(用的比较少)
    private IUserService userService;

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public void save(User user){
        System.out.println("action save方法");
        userService.add(user);
    }
}
