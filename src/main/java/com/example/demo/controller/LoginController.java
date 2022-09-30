package com.example.demo.controller;

import com.example.demo.entity.LoginInfo;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Objects;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("mobitel/login")
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new LoginInfo());
        return mav;
    }

    @PostMapping("mobitel/login")
    public String login(@ModelAttribute("user") LoginInfo user){
        LoginInfo authUser = LoginService.loginInfo(user.getUsername(), user.getPassword());
        System.out.print(authUser);
        if(Objects.nonNull(authUser)){
            return "redirect:/";
        }else{
            return "redirect:/mobitel/login";
        }
    }

    @RequestMapping(value = {"/mobitel/logout"}, method = RequestMethod.POST)
    public String logout(HttpRequest request, HttpResponse response){
        return "redirect:/";
    }
}
