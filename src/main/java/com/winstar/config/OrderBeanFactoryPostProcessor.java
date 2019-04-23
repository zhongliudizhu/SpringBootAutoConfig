package com.winstar.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class OrderBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    private static  final Logger logger= LoggerFactory.getLogger(OrderBeanFactoryPostProcessor.class);
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        logger.info("======进入OrderBeanFactoryPostProcessor的postProcessBeanFactory===");
        BeanDefinition orderBeanDefin = beanFactory.getBeanDefinition("order");
        MutablePropertyValues propertyValues = orderBeanDefin.getPropertyValues();
        propertyValues.addPropertyValue("orderDetail","orderDetailInfo");
        logger.info("=====设置orderDetail属性===");

    }
}
