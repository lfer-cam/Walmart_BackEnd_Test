package models;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Clients{
  @Id
  public ObjectId _id;
  
  public String name;
  public String dob;
  public String address;
  public String description;
  public String createdAt;
  public String updatedAt;
  

  public Clients() {}
  
  public Clients(ObjectId _id, String name, String dob, String address, String description, String createdAt, String updatedAt) {
    this._id = _id;
    this.name = name;
    this.dob = dob;
    this.address = address;
    this.description = description;
    this.createdAt =  createdAt;
    this.updatedAt = updatedAt;
  }
  
  public String get_id() { return _id.toString(); }
  public void set_id(ObjectId _id) { this._id = _id; }
  
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  
  public String getDob() { return dob; }
  public void setDob(String dob) { this.dob = dob; }
  
  public String getAddress() { return address; }
  public void setAddress(String address) { this.address = address; }

  public String getDescription(){ return description; }
  public void setDescription(String description){ this.description = description; }

  public String getCreatedAt() { return createdAt; }
  public void setCreatedAt(String createdAt){ this.createdAt = createdAt; }

  public String getUpdateAt() { return updatedAt; }
  public void setUpdateAt(String updatedAt){ this.updatedAt = updatedAt; }  
}