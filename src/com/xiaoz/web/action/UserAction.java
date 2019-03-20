package com.xiaoz.web.action;

import com.xiaoz.model.User;
import com.xiaoz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserAction {
    @Autowired
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
