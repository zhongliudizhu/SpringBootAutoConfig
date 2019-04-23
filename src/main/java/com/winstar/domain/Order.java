package com.winstar.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;



public class Order  implements InitializingBean, DisposableBean , BeanFactoryAware, BeanNameAware {
    private static  final Logger logger= LoggerFactory.getLogger(Order.class);

    private Integer orderId;
    private  String orderName;
    private Double  money;
    private String orderDetail;


    public Order() {
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setBeanName(String name) {

    }

    @Override
    public void destroy() throws Exception {
        logger.info(Thread.currentThread().getName()+"===执行Order的destroy方法===");

    }

    public void initOrder() {
        logger.info(Thread.currentThread().getName()+"===执行Order的init方法===");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info(Thread.currentThread().getName()+"===执行Order的afterPropertiesSet方法===");

    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderName='" + orderName + '\'' +
                ", money=" + money +
                ", orderDetail='" + orderDetail + '\'' +
                '}';
    }
}
