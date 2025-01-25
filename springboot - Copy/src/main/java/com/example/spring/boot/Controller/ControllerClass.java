package com.example.spring.boot.Controller;

import com.example.spring.boot.Model.Model;
import com.example.spring.boot.Service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class ControllerClass {

 @Autowired

 private ServiceClass serviceClass;
@PostMapping("/save")
 public ResponseEntity<Model> create (@RequestBody Model employee){
  if(serviceClass.saveEmployee(employee) ){
   return ResponseEntity.status(HttpStatus.CREATED).body(employee);

  } else{
    return ResponseEntity.status(HttpStatus.CONFLICT).body(employee);
   }
  }

 }


