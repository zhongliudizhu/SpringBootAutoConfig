package com.winstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {
    @RequestMapping("/welcome")
    public String welcome(){
        return "index";
    }

}
