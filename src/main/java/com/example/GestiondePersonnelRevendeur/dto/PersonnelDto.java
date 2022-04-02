package com.example.GestiondePersonnelRevendeur.dto;


import com.example.GestiondePersonnelRevendeur.model.Personnel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PersonnelDto {

    private Integer id;
    private String nom;
    private String prenom;
    private Adressedto adresse;
    private String photo;
    private String email;
    private String numTel;
    private String password;
    @JsonIgnore
    private List<RoleDto> roles;

    public static PersonnelDto fromEntity(Personnel personnel){

        if(personnel==null){
            //todo throw an exception
        }

        return PersonnelDto.builder()
                .email(personnel.getEmail())
                .id(personnel.getId())
                .nom(personnel.getNom())
                .prenom(personnel.getPrenom())
                .email(personnel.getEmail())
                .photo(personnel.getPhoto())
                .adresse(Adressedto.fromEntity(personnel.getAdresse()))
                .numTel(personnel.getNumTel())
                .build();

    }

    public static Personnel toEntity(PersonnelDto dto) {
        if (dto == null)
        {
            //todo throw an exception
            return null;
        }

        Personnel clt=new Personnel();
        clt.setId(dto.getId());
        clt.setPassword(dto.getPassword());
        clt.setAdresse(Adressedto.toEntity(dto.getAdresse()));
        clt.setEmail(dto.getEmail());
        clt.setNom(dto.getNom());
        clt.setPrenom(dto.getPrenom());
        clt.setPhoto(dto.getPhoto());
        clt.setNumTel(dto.getNumTel());

        return clt;
    }
}
