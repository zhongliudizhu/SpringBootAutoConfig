package com.winstar.controller;

import com.winstar.domain.User;
import com.winstar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/data")
public class DataController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getData")
    public  String getData(Model model){
        List<User> userList = userRepository.findAll();
        model.addAttribute("userList",userList);
        return  "index";
    }



}
