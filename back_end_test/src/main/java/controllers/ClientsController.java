package controllers;

import models.Clients;
import repositories.ClientsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.bson.types.ObjectId;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientsController {
  @Autowired
  private ClientsRepository repository;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Clients> getAllClients() {
    return repository.findAll();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Clients getClientsById(@PathVariable("id") ObjectId id) {
    return repository.findBy_id(id);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void modifyClientById(@PathVariable("id") ObjectId id, @Valid @RequestBody Clients client) {
    client.set_id(id);
    repository.save(client);
  }
  
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public Clients createClient(@Valid @RequestBody Clients client) {
    client.set_id(ObjectId.get());
    repository.save(client);
    return client;
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteClient(@PathVariable ObjectId id) {
    repository.delete(repository.findBy_id(id));
  }


}