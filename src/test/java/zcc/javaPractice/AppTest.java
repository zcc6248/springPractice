package zcc.javaPractice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import zcc.javaPractice.server.UserServer;

public class AppTest 
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("spring.xml");
        UserServer userServer = (UserServer) ca.getBean("userServer");
        userServer.text();
    }
}
