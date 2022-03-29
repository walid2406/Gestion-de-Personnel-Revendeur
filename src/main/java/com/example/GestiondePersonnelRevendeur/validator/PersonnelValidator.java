package com.example.GestiondePersonnelRevendeur.validator;

import com.example.GestiondePersonnelRevendeur.dto.PersonnelDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class PersonnelValidator {


    public static List<String> validate(PersonnelDto dto) {

        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("veuillez saisir le nom!");
            errors.add("veuillez saisir prenom Personnel!");
            errors.add("veuillez saisir l'email Personnel!");
            errors.add("veuillez saisirnumero de telephone!");
            errors.add("veuillez saisir mot de passe Personnel!");
            return errors;

        }
        if (!StringUtils.hasLength(dto.getNom())) {
            errors.add("veuillez saisir le nom!");
        }


        if (!StringUtils.hasLength(dto.getPrenom())) {
            errors.add("veuillez saisir prenom Personnel!");

        }

        if (!StringUtils.hasLength(dto.getPassword())) {
            errors.add("veuillez saisir mot de passe Personnel!");
        }

        if (!StringUtils.hasLength(dto.getNumTel())) {
            errors.add("veuillez saisir gsm Personnel");
        }



        return errors;
    }
}
