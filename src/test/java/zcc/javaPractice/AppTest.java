package zcc.javaPractice;

import static org.junit.Assert.assertTrue;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import zcc.javaPractice.AOPandIOC.server.UserServer;

public class AppTest 
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("spring.xml");
//        UserServer userServer = (UserServer) ca.getBean("userServer");
//        userServer.text();
        JdbcTemplate JdbcTemplate = (JdbcTemplate) ca.getBean("jdbcTemplate");
        Integer count = JdbcTemplate.queryForObject("select count(*) from user", Integer.class);
        System.out.println("总数:" + count);
    }
}
