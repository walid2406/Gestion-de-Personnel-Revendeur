package com.example.GestiondePersonnelRevendeur.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "personnel")
public class Personnel extends Personne{
    private String password;

    @OneToMany(mappedBy = "personnel")
    private List<Role> roles;

}
