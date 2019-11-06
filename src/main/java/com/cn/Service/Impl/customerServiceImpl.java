package com.cn.Service.Impl;

import com.cn.Service.CustomerService;
import com.cn.dao.CustomerMapper;
import com.cn.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class customerServiceImpl implements CustomerService {
   @Autowired
    private CustomerMapper mapper;
    public void insertCustomer(Customer customer) {
        mapper.insert(customer);
    }

    @Override
    public List<Customer> findAll() {
        return mapper.findAll();
    }
}
