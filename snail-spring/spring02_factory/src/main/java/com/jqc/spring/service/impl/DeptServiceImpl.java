package com.jqc.spring.service.impl;

import com.jqc.spring.dao.DeptDao;
import com.jqc.spring.dao.impl.DeptDaoImpl;
import com.jqc.spring.factory.BeanFactory;
import com.jqc.spring.service.DeptService;

public class DeptServiceImpl implements DeptService {
    private DeptDao deptDao = new DeptDaoImpl();
    //这里，老师讲课有问题？？？如果用下面的语句的话，DeptService获取到的deptDao为null，会报空指针异常
//    private DeptDao deptDao = (DeptDao) BeanFactory.getBean("deptDao");

//    private int i = 1;

    public void saveDept() {
        int i = 1;
//        System.out.println(deptDao);
        deptDao.saveDept();
        System.out.println(i);
        i++;
    }
}
