package com.winstar.config;

import com.winstar.condition.LinuxCondition;
import com.winstar.condition.WindowsCondition;
import com.winstar.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.winstar.config")
public class UserConfig {
    @Bean
    public User user1(){
        return  new User("Doug Lean", 70);
    }

    @Bean
    @Conditional(value = {WindowsCondition.class})
    public User user2(){
        return new User("BillGates",60);
    }

    @Bean
    @Conditional(value = {LinuxCondition.class})
    public User user3(){
        return new User("linux",40);
    }



}
