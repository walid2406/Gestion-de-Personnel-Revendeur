package com.example.GestiondePersonnelRevendeur.securityJwt.repository;


import com.example.GestiondePersonnelRevendeur.securityJwt.models.ERole;
import com.example.GestiondePersonnelRevendeur.securityJwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);


}
