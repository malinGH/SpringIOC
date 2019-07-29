package com.souche.dao.impl;

import org.souche.framework.ioc.annoation.Repository;

import com.souche.dao.PaperDAO;

@Repository
public class PaperDAOImpl implements PaperDAO {

    public PaperDAOImpl() {
        System.out.println("dao instance");
    }

    @Override
    public String addPaper() {
        System.out.println("添加示例操作");
        return "dao 操作执行";
    }

}
