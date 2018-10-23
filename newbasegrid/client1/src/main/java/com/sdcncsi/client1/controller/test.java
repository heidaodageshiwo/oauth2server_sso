package com.sdcncsi.client1.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.RolesAllowed;
import java.util.ArrayList;
import java.util.List;

@Controller
@EnableGlobalMethodSecurity(prePostEnabled = true)//开启注解
public class test {

    @RequestMapping("/success")
    //@PreAuthorize("hasRole('ROLE_bb')")
    @PreAuthorize("hasRole('ROLE_USER')")
    //@Secured(value = {["ROLE_ADMIN", "ROLE_USER"])
    public ModelAndView ss(){
        User user = new User();
        user.setUsername("zhangqiang");
        user.setPassword("1234");
        List<User> users  = new ArrayList<User>();
        users.add(user);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        mv.addObject("users",users);
        return mv;
    }
    @RequestMapping("/success1")
    //@PreAuthorize("hasRole('ROLE_bb')")
    @PreAuthorize("hasRole('ROLE_USERddd')")
    //@Secured(value = {["ROLE_ADMIN", "ROLE_USER"])
    public ModelAndView ssaaa(){
        User user = new User();
        user.setUsername("zhangqiang");
        user.setPassword("1234");
        List<User> users  = new ArrayList<User>();
        users.add(user);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        mv.addObject("users",users);
        return mv;
    }
}
