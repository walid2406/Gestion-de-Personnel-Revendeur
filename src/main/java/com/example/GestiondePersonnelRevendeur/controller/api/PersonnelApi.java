package com.example.GestiondePersonnelRevendeur.controller.api;

import com.example.GestiondePersonnelRevendeur.dto.PersonnelDto;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.GestiondePersonnelRevendeur.utils.Constants.CLIENT_ENDPOINT;
import static com.example.GestiondePersonnelRevendeur.utils.Constants.PERSONNEL_ENDPOINT;

@Api(PERSONNEL_ENDPOINT)
public interface PersonnelApi {


    @PostMapping(PERSONNEL_ENDPOINT+"/create")
    PersonnelDto save(@RequestBody PersonnelDto dto);
    @GetMapping(PERSONNEL_ENDPOINT+"/{id}")
    PersonnelDto findById(@PathVariable Integer id);
    @GetMapping(PERSONNEL_ENDPOINT+"/all")
    List<PersonnelDto> findAll();
    @DeleteMapping(PERSONNEL_ENDPOINT+"/del/{id}")
    void delete(@PathVariable Integer id);
    @PutMapping(PERSONNEL_ENDPOINT+"/{id}")
    ResponseEntity<PersonnelDto> updatePersonnel(@PathVariable(value = "id") Integer personnelId,
                                                    @RequestBody PersonnelDto dto) ;
}
