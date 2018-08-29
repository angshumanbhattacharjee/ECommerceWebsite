package com.databaseConn;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class ConnectionFactory {
	
	public static MongoDatabase getConn() 
	{
		MongoClient mongo = new MongoClient("localhost",27017);
		MongoDatabase database = mongo.getDatabase("Angshuman");
		return database;
	}
	
	public static DB getConn1() 
	{
		MongoClient mongo = new MongoClient("localhost",27017);
		DB database = mongo.getDB("Angshuman");
		return database;
	}
}
