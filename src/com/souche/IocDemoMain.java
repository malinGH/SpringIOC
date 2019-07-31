package com.souche;

import com.souche.controller.ControllerDemo;
import org.souche.framework.ioc.context.ApplicationContext;
import org.souche.framework.ioc.context.ClassPathXmlApplicationContext;

/**
 * @author malin
 */
public class IocDemoMain {
    /**
     * @Description:
     * @Param1: args
     * @return: void
     * @Author: malin
     * @Date: 2019-07-31
     */
    public static void main(String[] args) {
        // 实例化一个Spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
        // 从容器(工厂)获取对象
        ControllerDemo controllerDemo = (ControllerDemo) ctx.getBean("controllerDemo");
        String helloWorld = controllerDemo.helloWorld();
        System.out.println(helloWorld);
    }
}
