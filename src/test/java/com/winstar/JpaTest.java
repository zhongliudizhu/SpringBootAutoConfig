package com.winstar;

import com.winstar.domain.User;
import com.winstar.repository.UserRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JpaTest {
  private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ApplicationContext context;


    private List<User> users;
   // @Before
    public  void initUsers(){
        logger.info("=====进行初始化======");
        users= Arrays.asList(new User[]{
               new User("bill",50),
                new User("linux",40),
                new User("doug lea",60),
                new User("Rod Johnsn",50),
                new User("Gierke",20),
                new User("Mark Paluch",30),
                new User("Oliver Gierke",30),


        });

    }
  /**
   * 执行jpa的批量插入
   * */
    @Test
    public void userTest(){
        UserRepository bean = context.getBean(UserRepository.class);
        List<User> users = bean.saveAll(new Iterable<User>() {
            @Override
            public Iterator<User> iterator() {
                return JpaTest.this.users.iterator();
            }
        });
        if(!users.isEmpty()){
            for(User user:users){
                logger.info("users==user_id"+user.getUserId());
            }

        }
    }

    @After
    public void testOver(){
        logger.info("======批量插入结束======");
    }


    @Test
    public  void  queryByCondition(){
        UserRepository userRepository=context.getBean(UserRepository.class);
        List<User> usersByAgeBetween = userRepository.findUsersByAgeBetween(30, 60);
        logger.info("======="+usersByAgeBetween);

    }

}
