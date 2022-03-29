package com.example.GestiondePersonnelRevendeur.validator;

import com.example.GestiondePersonnelRevendeur.dto.ClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {


    public static List<String> validate(ClientDto dto) {

        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("veuillez saisir le nom!");
            errors.add("veuillez saisir prenom client!");
            errors.add("veuillez saisir l'email client!");
            errors.add("veuillez saisirnumero de telephone!");
            return errors;

        }
        if (!StringUtils.hasLength(dto.getNom())) {
            errors.add("veuillez saisir le nom!");
        }


        if (!StringUtils.hasLength(dto.getPrenom())) {
            errors.add("veuillez saisir prenom client!");

        }

        if (!StringUtils.hasLength(dto.getAdsl())) {
            errors.add("veuillez saisir ADSL client!");
        }

        if (!StringUtils.hasLength(dto.getNumTel())) {
            errors.add("veuillez saisir gsm client");
        }



        return errors;
    }
}
