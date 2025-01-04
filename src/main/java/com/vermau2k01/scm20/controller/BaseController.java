package com.vermau2k01.scm20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BaseController {

    @GetMapping("/home")
    public String getMethodName() {
        return "home";
    }
    

}
