package com.winstar.controller;

import com.winstar.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stater")
public class StarterController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/getStarterInfo")
    public String getUser(){
        return helloService.getItemInfo();
    }

}
