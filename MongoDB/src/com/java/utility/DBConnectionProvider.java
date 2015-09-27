package com.java.utility;


import static com.java.utility.MongoDB.IP;
import static com.java.utility.MongoDB.PORT;
import static com.java.utility.MongoDB.dbName;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class DBConnectionProvider {
	
 
 public static MongoDatabase getDbConnection(){
	 MongoClient mongoClient = new MongoClient( IP , PORT );
	 MongoDatabase db = mongoClient.getDatabase(dbName);
	 return db;	 
 }
 
}
