package com.example.Ritika.Service;

import ch.qos.logback.core.model.Model;
import com.example.Ritika.Exception.ExceptionClass;
import com.example.Ritika.Model.ModelClass;
import com.example.Ritika.Repository.RepositoryClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
    @Autowired
    public RepositoryClass repositoryClass;

    public boolean saveRecord(ModelClass modelClass) {
        if (repositoryClass.existsByName(String.valueOf(modelClass.getName()))) {
            throw new ExceptionClass("Already Exists" + modelClass.getName() + HttpStatus.CONFLICT);
        } else {
            repositoryClass.save(modelClass);
        }
        return true;
    }
}




