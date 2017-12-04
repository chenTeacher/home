import com.example.pojo.User;
import com.example.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})
public class TestMyBatis {

    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    @Resource
    private UserService userService =null;

    @Test
    public void selectUserById(){
        User user = userService.getUserById("421003199405300036");
        System.out.println( "年龄："+user.getAge()+",姓名："+ user.getUsername());

    }
    @Test
    public void getUserALL(){
        List<User> userALL= userService.getUserALL();
        for ( User user:userALL) {
            System.out.println(user.getUsername());
        }
    }
}
