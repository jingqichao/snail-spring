package com.jqc.spring.ui;

import com.jqc.spring.factory.BeanFactory;
import com.jqc.spring.service.DeptService;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {

    public static void main(String[] args) {
        //DeptService as = new DeptServiceImpl();
        for (int i = 0; i < 5; i++) {
            DeptService as = (DeptService) BeanFactory.getBean("deptService");
            System.out.println(as);
            as.saveDept();
        }

    }
}
