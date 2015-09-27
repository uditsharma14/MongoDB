package com.java.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.java.service.*;
import com.java.model.Customer;


@Path("/customerController")
public class MyController {
	CustomerService customerService=new CustomerService();
    
    
    @POST
	@Path("/createCustomer")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createCustomer( Customer customer ) {
        String output = customer.toString();
        System.out.println("create Customer"+output);
		customerService.saveCustomer(customer);
		return Response.status(200).entity(output).build();
	}
     
}
