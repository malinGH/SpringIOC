package com.souche.dao.impl;

import com.souche.dao.DemoDao;
import org.souche.framework.ioc.annoation.Repository;

@Repository
public class DemoDaoImpl implements DemoDao {


    @Override
    public String add() {
        System.out.println("添加示例操作");
        return "dao 操作执行";
    }

}
