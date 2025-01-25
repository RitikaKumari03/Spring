package com.example.spring.boot.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
public class Model {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private int id;
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  private String name;

  public String getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }

  private String phoneNo;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  private int age;

}
