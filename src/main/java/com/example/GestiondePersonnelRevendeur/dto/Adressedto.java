package com.example.GestiondePersonnelRevendeur.dto;

import com.example.GestiondePersonnelRevendeur.model.Adresse;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
@Data
@Builder
public class Adressedto {



    private String adresse1;
    private String adresse2;
    private String zonePostale;

    public static Adressedto fromEntity(Adresse adresse){

        if(adresse==null){
            //todo throw exceprtion
            return null;

        }
        return Adressedto.builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .zonePostale(adresse.getZonePostale())
                .build();

    }

    public static Adresse toEntity(Adressedto adressedto){

        if(adressedto==null){
            //todo throw exceprtion
            return null;
        }

        Adresse adresse=new Adresse();
        adresse.setAdresse1(adressedto.getAdresse1());
        adresse.setAdresse2(adressedto.getAdresse2());
        adresse.setZonePostale(adressedto.getZonePostale());
        return adresse;
    }
}
