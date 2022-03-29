package com.example.GestiondePersonnelRevendeur.services.impl;

import com.example.GestiondePersonnelRevendeur.dto.PersonnelDto;
import com.example.GestiondePersonnelRevendeur.dto.PersonnelDto;
import com.example.GestiondePersonnelRevendeur.exception.EntityNotFounException;
import com.example.GestiondePersonnelRevendeur.exception.ErrorCodes;
import com.example.GestiondePersonnelRevendeur.exception.InvalidEntityException;
import com.example.GestiondePersonnelRevendeur.repository.PersonnelRepository;

import com.example.GestiondePersonnelRevendeur.services.PersonnelService;
import com.example.GestiondePersonnelRevendeur.validator.PersonnelValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class PersonnelServiceImpl implements PersonnelService {
    private PersonnelRepository personnelRepository;

    @Autowired
    public PersonnelServiceImpl(PersonnelRepository personnelRepository) {

        this.personnelRepository = personnelRepository;
    }

    @Override
    public PersonnelDto save(PersonnelDto dto) {
        List<String> errors= PersonnelValidator.validate(dto);
        if(!errors.isEmpty()){
            log.error("Personnel non valide");
            throw new InvalidEntityException("Personnel non valide", ErrorCodes.PERSONNEL_NOT_VALID,errors);

        }
        else {
            return PersonnelDto.fromEntity(personnelRepository.save(PersonnelDto.toEntity(dto)));
        }

    }

    @Override
    public PersonnelDto findById(Integer id) {

        if(id==null){
            log.error("id Personnel est null");
            return null;
        }
        else {
            return personnelRepository.findById(id)
                    .map(PersonnelDto::fromEntity)
                    .orElseThrow(()-> new EntityNotFounException("Personnel non trouvee avec id" + id,ErrorCodes.PERSONNEL_NOT_FOUND));
        }

    }

    @Override
    public List<PersonnelDto> findAll() {

        return personnelRepository.findAll()
                .stream()
                .map(PersonnelDto::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        if(id==null){
            log.error("id saisie est null");

        }

        personnelRepository.deleteById(id);

    }
}
