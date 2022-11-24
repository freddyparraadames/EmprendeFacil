package com.example.demo.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modelos.EmprendedorModelo;


@Repository
public interface EmprendedorRepositorio extends MongoRepository<EmprendedorModelo, String> {
    
}