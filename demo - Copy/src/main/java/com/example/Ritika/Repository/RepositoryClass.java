package com.example.Ritika.Repository;

import com.example.Ritika.Model.ModelClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryClass extends JpaRepository<ModelClass,Long> {
    public boolean alreadyExists(String name);


}
