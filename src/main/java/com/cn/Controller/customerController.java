package com.cn.Controller;

import com.alibaba.fastjson.JSON;
import com.cn.Service.CustomerService;
import com.cn.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class customerController {
    @Autowired
    private CustomerService service;
    @RequestMapping("/add")
   public String addCustomer(Customer customer){
        service.insertCustomer(customer);
        return "success";
    }
    @RequestMapping("/findAll")
    @ResponseBody
    public String findALlCustomer()  {
        List<Customer> list = service.findAll();
        String json = JSON.toJSONString(list);
        return json;
    }
    @RequestMapping("/text1")
   public void Servlet(HttpServletResponse response, HttpServletRequest request) throws IOException, ServletException {
     request.getRequestDispatcher("../index.jsp").forward(request,response);
      // response.sendRedirect("../index.jsp");
   }
   @RequestMapping("/anntataion")
   public String textAnntation(){
       System.out.println("这个时请求转发的方式");
       return "forward:../index.jsp";

   }
    @RequestMapping("/anntataion2")
    public String textAnntation1(){
        System.out.println("这个时请求转发的方式");
        return "redirect:../index.jsp";

    }



}
