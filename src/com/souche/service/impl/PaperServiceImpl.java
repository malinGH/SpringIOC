package com.souche.service.impl;

import org.souche.framework.ioc.annoation.Autowired;
import org.souche.framework.ioc.annoation.Service;

import com.souche.dao.PaperDAO;
import com.souche.service.PaperService;

@Service("service")
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperDAO dao;

    public PaperServiceImpl() {
        System.out.println("service instance");
    }

    public PaperServiceImpl(PaperDAO dao) {
        this.dao = dao;
    }

    @Override
    public String addPaper() {
        System.out.println("业务处理");
        return dao.addPaper();
    }
}
