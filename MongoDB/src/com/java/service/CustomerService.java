package com.java.service;

import com.java.dao.CostumerDao;
import com.java.model.Customer;

public class CustomerService {
  private CostumerDao  customerDao=new CostumerDao(); 	 
  public Customer saveCustomer(Customer customer){
	  customerDao.insertCustomer(customer);
	  return customer;  
  }
}
