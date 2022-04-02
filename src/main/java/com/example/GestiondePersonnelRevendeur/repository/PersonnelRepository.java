package com.example.GestiondePersonnelRevendeur.repository;

import com.example.GestiondePersonnelRevendeur.model.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonnelRepository extends JpaRepository<Personnel,Integer> {




}
