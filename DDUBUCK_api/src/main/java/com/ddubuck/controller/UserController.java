package com.ddubuck.controller;

import com.ddubuck.common.domain.User;
import com.ddubuck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
   /* @RequestMapping("/join")
    public void join(){
        return join;
    }*/

    @RequestMapping ("/joinMember")

    public String joinUs(User user){
        user.setUserName("윤구");
        user.setAgreeMarketing("1");
        user.setEmail("연습");
        user.setPassword("123");
        user.setPhoneNumber("12341234");
        user.setNickname("개리");
        user.setCreateAt("0313");
        user.setCreatedBy("기뮨구");
        user.setWithdraw("1");
        user.setEnabled("1");
        userService.joinUser(user);
        return "index";
    }
}
