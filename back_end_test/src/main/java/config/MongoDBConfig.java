package config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;
import java.util.Collections;

@Configuration
public class MongoDBConfig extends AbstractMongoClientConfiguration {

	@Override
	protected String getDatabaseName() {
		return "Back-end_Developer_Test";
	}
	
	@Override
	public MongoClient mongoClient() {
		ConnectionString cs = new ConnectionString("mongodb+srv://walmart_hire_dba:JhmMPfGnHeblKISk@cluster0.fmuxy.mongodb.net/Back-endDeveloper_Test?retryWrites=true&w=majority");
		MongoClientSettings mcs = MongoClientSettings.builder().applyConnectionString(cs).build();
		
		return MongoClients.create(mcs);
	}
	

	@Override
	public Collection<String> getMappingBasePackages(){
		return Collections.singleton("com.walmart_back_end_test_luis_cam");
	}
}
