package com.winstar.bootstrap;

import com.winstar.config.OrderConfig;
import com.winstar.config.UserConfig;
import com.winstar.domain.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppConditional {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=
                new AnnotationConfigApplicationContext();
        applicationContext.register(new Class[]{UserConfig.class, OrderConfig.class});
        applicationContext.refresh();
        System.out.println(applicationContext.getBean(Order.class));
        applicationContext.destroy();
    }

}
