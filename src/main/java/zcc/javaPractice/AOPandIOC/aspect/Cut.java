package zcc.javaPractice.AOPandIOC.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * @author ：zcc
 * @date ：Created in 2021/11/4 19:59
 * @description：
 * @version: 1
 */

@Component
public class Cut {

    public void before(){
        System.out.println("before..........");
    }

    public void after(){
        System.out.println("after...........");
    }

    public void around(ProceedingJoinPoint pj){
        System.out.println("around.......before.....");
        try {
            //必须有，才能继续执行
            pj.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around......after........");
    }
}
