package com.example.GestiondePersonnelRevendeur.repository;

import com.example.GestiondePersonnelRevendeur.model.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonnelRepository extends JpaRepository<Personnel,Integer> {
}
