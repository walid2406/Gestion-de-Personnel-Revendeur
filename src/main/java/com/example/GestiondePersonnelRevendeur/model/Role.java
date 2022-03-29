package com.example.GestiondePersonnelRevendeur.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "role")
public class Role extends AbstractEntity {

    @Column(name="rolename")
    private String rolename;

    @ManyToOne
    @JoinColumn(name = "idpersonnel")
    private Personnel personnel;

}
