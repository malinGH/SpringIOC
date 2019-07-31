package com.souche.controller;

import com.souche.service.DemoService;
import org.souche.framework.ioc.annoation.Autowired;
import org.souche.framework.ioc.annoation.Controller;

/**
 * @program: SpringIOC
 * @ClassName: ControllerDemo
 * @description: 测试demo项目
 * @author: malin
 * @create: 2019-07-29 09:58
 **/
@Controller(value = "controllerDemo")
public class ControllerDemo {

    @Autowired
    private DemoService demoService;

    public ControllerDemo() {
        System.out.println("初始化DemoControllerDemo");
    }

    public String helloWorld() {
        System.out.println("controller控制层调用");
        return "操作结果返回值: " + demoService.add();
    }


}
