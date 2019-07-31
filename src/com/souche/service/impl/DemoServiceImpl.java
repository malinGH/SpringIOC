package com.souche.service.impl;

import com.souche.dao.DemoDao;
import com.souche.service.DemoService;
import org.souche.framework.ioc.annoation.Autowired;
import org.souche.framework.ioc.annoation.Service;

/**
 * @author malin
 */
@Service("service")
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao dao;

    public DemoServiceImpl() {
        System.out.println("初始化DemoService");
    }

    @Override
    public String add() {
        System.out.println("业务处理");
        return dao.add();
    }
}
