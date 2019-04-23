package com.winstar;

import com.winstar.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ConditionTest {
    private static  final Logger logger= LoggerFactory.getLogger(ConditionTest.class);
    @Autowired
    private ApplicationContext context;
    @Test
    public void test1(){
        Map<String, User> users = context.getBeansOfType(User.class);
        for(Map.Entry<String,User> map:users.entrySet()){
            logger.info(map.getKey()+"====="+map.getValue());
        }


    }

}
