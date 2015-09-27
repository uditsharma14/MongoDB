package com.java.dao;

import org.bson.Document;
import com.java.model.Customer;
import com.java.utility.DBConnectionProvider;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class CostumerDao {
 private static MongoDatabase mongoDatabase=DBConnectionProvider.getDbConnection();
 public Customer insertCustomer(Customer customer){
	MongoCollection<Document> coll = mongoDatabase.getCollection("customer");
	Document document=new Document();
	document.append("customerID", customer.getCustomerID());
	document.append("FirstName", customer.getFirstName());
	document.append("lastName", customer.getLastName());
	document.append("dob", customer.getDob());
	//document.append("addresses", customer.getAddresses());
	coll.insertOne(document);
	return customer;

 }
}
