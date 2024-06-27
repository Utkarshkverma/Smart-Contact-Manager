package com.vermau2k01.scm20.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
public class PageController {
    
   
    
    @RequestMapping("/home")
    public String home(Model model) {
       
        model.addAttribute("name", "substring technology");
        model.addAttribute("project", "smart contact manager");
        return "home";
    }

    // about page
    @RequestMapping("/about")
    public String about(Model model) {
        System.out.println("About page");
        return "about";
    }

    @RequestMapping("/services")
    public String Services() {
        return "services";
    }

    
    @RequestMapping("/contact")
    public String Contacts() {
        return "contact";
    }

    @RequestMapping("/login")
    public String Login() {
        return "login";
    }
    
}
