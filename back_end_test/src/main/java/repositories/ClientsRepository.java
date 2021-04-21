package repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import models.Clients;

@EnableMongoRepositories(basePackages = {"repositories"})
public interface ClientsRepository extends MongoRepository<Clients, String> {
  
	Clients findBy_id(ObjectId _id);
}