package com.cn.text;

import com.cn.dao.CustomerMapper;
import com.cn.domain.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisText {
    @Test
    public void text(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:com/cn/spring/applicationContext-dao.xml");
        CustomerMapper bean = applicationContext.getBean(CustomerMapper.class);
        Customer customer = new Customer();
        customer.setAge(17);
        customer.setName("李四");
        customer.setTel("11288");
        int insert = bean.insert(customer);

        System.out.println(customer);
    }
}
