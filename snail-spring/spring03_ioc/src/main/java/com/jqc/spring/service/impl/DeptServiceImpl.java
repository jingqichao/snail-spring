package com.jqc.spring.service.impl;

import com.jqc.spring.dao.DeptDao;
import com.jqc.spring.dao.impl.DeptDaoImpl;
import com.jqc.spring.service.DeptService;

public class DeptServiceImpl implements DeptService {
    private DeptDao deptDao = new DeptDaoImpl();

    public DeptServiceImpl(){
        System.out.println("对象创建了");
    }
    public void saveDept() {
        deptDao.saveDept();
    }
}
