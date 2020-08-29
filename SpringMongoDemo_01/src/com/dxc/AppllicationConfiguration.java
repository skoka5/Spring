package com.dxc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;


@Configuration
@ComponentScan(basePackages = "com.dxc.beans")
public class AppllicationConfiguration {
	
	@Bean
	public MongoDbFactory getMongoDbFactory() throws Exception{
		MongoClient mongoClient = new MongoClient("localhost" , 27017);
		return new SimpleMongoDbFactory(mongoClient , "dxc");
	}
	
	public MongoTemplate getMongoTemplate() throws Exception {
		MongoTemplate mongoTemplate = new MongoTemplate(getMongoDbFactory());
		return mongoTemplate;
	}

}
