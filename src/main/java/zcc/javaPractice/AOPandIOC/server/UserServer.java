package zcc.javaPractice.AOPandIOC.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zcc.javaPractice.AOPandIOC.controller.UserCont;

/**
 * @author ：zcc
 * @date ：Created in 2021/11/4 19:20
 * @description：用户类
 * @version: 1
 */

@Service
public class UserServer {
//    @Resource //第三方插件
    @Autowired
    UserCont userCont;

    public void text(){
        userCont.text();
        System.out.println("server user...........");
    }
}
