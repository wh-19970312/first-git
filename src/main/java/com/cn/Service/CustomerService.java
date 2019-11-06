package com.cn.Service;

import com.cn.domain.Customer;

import java.util.List;

public interface CustomerService {
    void insertCustomer(Customer customer);
    List<Customer> findAll();

}
