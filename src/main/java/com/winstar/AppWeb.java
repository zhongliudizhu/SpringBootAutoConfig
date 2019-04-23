package com.winstar;

import com.winstar.domain.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.winstar.repository"
)
public class AppWeb {
    public static void main(String[] args) {
       SpringApplication.run(AppWeb.class,args);
    }


}
