package com.example.GestiondePersonnelRevendeur.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;



@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable

public class Adresse {

    @Column(name="adresse1")
    private String adresse1;

    @Column(name="adresse2")
    private String adresse2;

    @Column(name="zone_postale")
    private String zonePostale;

}