package com.example.GestiondePersonnelRevendeur.services;

import com.example.GestiondePersonnelRevendeur.dto.PersonnelDto;

import java.util.List;

public interface PersonnelService {


    PersonnelDto save(PersonnelDto dto);
    PersonnelDto findById(Integer id);
    List<PersonnelDto> findAll();
    void delete(Integer id);
}
