package com.winstar.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class OrderBeanPostProcessor implements BeanPostProcessor {
    private static  final Logger logger= LoggerFactory.getLogger(OrderBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
         if(beanName.equals("order")){
             logger.info(Thread.currentThread().getName()+"===执行OrderBeanPostProcessor的postProcessBeforeInitialization方法===");
         }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("order")){
            logger.info(Thread.currentThread().getName()+"===执行OrderBeanPostProcessor的postProcessAfterInitialization方法===");
        }
         return bean;
    }
}
