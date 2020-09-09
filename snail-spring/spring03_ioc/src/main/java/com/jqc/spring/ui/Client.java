package com.jqc.spring.ui;

import com.jqc.spring.dao.DeptDao;
import com.jqc.spring.service.DeptService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {

    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取bean
        DeptService deptService = (DeptService) context.getBean("deptService");
        DeptDao deptDao = context.getBean("deptDao",DeptDao.class);
        System.out.println(deptService);
        System.out.println(deptDao);
    }
}
