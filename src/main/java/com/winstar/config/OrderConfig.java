package com.winstar.config;

import com.winstar.domain.Order;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages ="com.winstar.config")
public class OrderConfig {

    @Bean(initMethod = "initOrder")
    public Order order(){
        Order order=new Order();
        order.setOrderId(01);
        order.setOrderName("aliPay_Order");
        order.setMoney(3000.0);
        return order;
    }
     @Bean
     public OrderBeanPostProcessor orderBeanPostProcessor(){
        return  new OrderBeanPostProcessor();
     }
     @Bean
    public BeanFactoryPostProcessor BeanFactoryPostProcessor(){
        return  new OrderBeanFactoryPostProcessor();
     }
}
