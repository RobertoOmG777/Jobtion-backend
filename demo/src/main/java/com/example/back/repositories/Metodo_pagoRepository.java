package com.example.back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.back.models.Metodo_pagoModel;
@Repository
public interface Metodo_pagoRepository extends JpaRepository<Metodo_pagoModel, Long>{
}
