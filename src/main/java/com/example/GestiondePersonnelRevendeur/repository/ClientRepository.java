package com.example.GestiondePersonnelRevendeur.repository;

import com.example.GestiondePersonnelRevendeur.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
