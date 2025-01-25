package com.example.spring.boot.Service;

import com.example.spring.boot.Exception.ExceptionClass;
import com.example.spring.boot.Model.Model;
import com.example.spring.boot.Repository.RepositoryClass;
import jdk.jfr.consumer.RecordedClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
    @Autowired
    private RepositoryClass repositoryClass;
    public boolean saveEmployee(Model employee) {
        if(repositoryClass.existsByName(String.valueOf(employee))) {
            throw new ExceptionClass("THE USER WITH NAME" + employee.getName() + "ALREADY EXISTS" + HttpStatus.CONFLICT);
        }else{
            repositoryClass.save(employee);

            return true;
        }

        }

}
