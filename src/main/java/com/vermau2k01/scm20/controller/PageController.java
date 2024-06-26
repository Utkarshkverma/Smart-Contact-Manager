package com.vermau2k01.scm20.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    
    private static final Logger logger = LoggerFactory.getLogger(PageController.class);
    
    @RequestMapping("/home")
    public String home(Model model) {
        logger.info("Home controller");
        model.addAttribute("name", "substring technology");
        model.addAttribute("project", "smart contact manager");
        return "home";
    }
}
