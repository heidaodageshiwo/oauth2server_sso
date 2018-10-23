package com.sdcncsi.oauth2server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class LoginController {

    @GetMapping("/authentication/require")
    public ModelAndView require() {
        return new ModelAndView("ftl/login");
    }
}
