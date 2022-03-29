package com.example.GestiondePersonnelRevendeur.dto;

import com.example.GestiondePersonnelRevendeur.model.Adresse;
import com.example.GestiondePersonnelRevendeur.model.Client;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;

@Data
@Builder
public class ClientDto {


    private Integer id;
    private String adsl;
    private String nom;
    private String prenom;
    private Adressedto adresse;
    private String photo;
    private String email;
    private String numTel;

    public static ClientDto fromEntity(Client client){



        if(client==null){
            //todo throw an exception
        }

        return ClientDto.builder()
                .email(client.getEmail())
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .email(client.getEmail())
                .photo(client.getPhoto())
                .adresse(Adressedto.fromEntity(client.getAdresse()))
                .numTel(client.getNumTel())
                .adsl(client.getAdsl())
                .build();
    }

    public static Client toEntity(ClientDto dto) {
        if (dto == null)
        {
            //todo throw an exception
            return null;
        }

        Client clt=new Client();
        clt.setId(dto.getId());
        clt.setAdsl(dto.getAdsl());
        clt.setAdresse(Adressedto.toEntity(dto.getAdresse()));
        clt.setEmail(dto.getEmail());
        clt.setNom(dto.getNom());
        clt.setPrenom(dto.getPrenom());
        clt.setPhoto(dto.getPhoto());
        clt.setNumTel(dto.getNumTel());

        return clt;
    }
}
