package com.example.spring.boot.Repository;

import com.example.spring.boot.Model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryClass extends JpaRepository<Model,Long> {
      public boolean existsByName(String employee);




}
