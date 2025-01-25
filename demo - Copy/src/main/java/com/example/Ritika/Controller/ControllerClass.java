package com.example.Ritika.Controller;

import com.example.Ritika.Model.ModelClass;
import com.example.Ritika.Service.ServiceClass;
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
    public ServiceClass serviceClass;
    @PostMapping("/save")
    public ResponseEntity<ModelClass> create (@RequestBody ModelClass modelClass){
        if(serviceClass.saveRecord(modelClass)) {
            return ResponseEntity.status(HttpStatus.CREATED).body(modelClass);
        }else{
            return ResponseEntity.status(HttpStatus.CONFLICT).body(modelClass);
        }

    }

}
