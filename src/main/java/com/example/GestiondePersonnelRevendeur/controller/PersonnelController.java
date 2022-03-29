package com.example.GestiondePersonnelRevendeur.controller;

import com.example.GestiondePersonnelRevendeur.controller.api.PersonnelApi;

import com.example.GestiondePersonnelRevendeur.dto.PersonnelDto;
import com.example.GestiondePersonnelRevendeur.services.PersonnelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonnelController implements PersonnelApi {
    
    PersonnelService personnelService;

    @Autowired
    public PersonnelController(PersonnelService personnelService) {
        this.personnelService = personnelService;
    }

    @Override
    public PersonnelDto save(PersonnelDto dto) {
        return personnelService.save(dto);
    }



    @Override
    public PersonnelDto findById(Integer id) {
        return personnelService.findById(id);
    }

    @Override
    public List<PersonnelDto> findAll() {
        return personnelService.findAll();
    }

    @Override
    public void delete(Integer id) {
        personnelService.delete(id);

    }

    @Override
    public ResponseEntity<PersonnelDto> updatePersonnel(Integer personnelId, PersonnelDto dto)  {
        PersonnelDto savedPersonnelDto=personnelService.findById(personnelId);

        savedPersonnelDto.setNom(dto.getNom());
        savedPersonnelDto.setAdresse(dto.getAdresse());
        savedPersonnelDto.setNumTel(dto.getNumTel());
        savedPersonnelDto.setEmail(dto.getEmail());
        savedPersonnelDto.setPrenom(dto.getPrenom());
        savedPersonnelDto.setPhoto(dto.getPhoto());
        savedPersonnelDto.setPassword(dto.getPassword());
        final PersonnelDto updatedPersonnel=personnelService.save(savedPersonnelDto);
        return ResponseEntity.ok(updatedPersonnel);
    }
}
