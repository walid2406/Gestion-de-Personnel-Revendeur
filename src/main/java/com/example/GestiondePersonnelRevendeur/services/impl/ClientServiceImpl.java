package com.example.GestiondePersonnelRevendeur.services.impl;

import com.example.GestiondePersonnelRevendeur.dto.ClientDto;
import com.example.GestiondePersonnelRevendeur.exception.EntityNotFounException;
import com.example.GestiondePersonnelRevendeur.exception.ErrorCodes;
import com.example.GestiondePersonnelRevendeur.exception.InvalidEntityException;
import com.example.GestiondePersonnelRevendeur.model.Client;
import com.example.GestiondePersonnelRevendeur.repository.ClientRepository;
import com.example.GestiondePersonnelRevendeur.services.ClientService;
import com.example.GestiondePersonnelRevendeur.validator.ClientValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {

        this.clientRepository = clientRepository;
    }

    @Override
    public ClientDto save(ClientDto dto) {
        List<String> errors= ClientValidator.validate(dto);
        if(!errors.isEmpty()){
            log.error("client non valide");
            throw new InvalidEntityException("client non valide", ErrorCodes.CLIENT_NOT_VALID,errors);

        }
        else {
            return ClientDto.fromEntity(clientRepository.save(ClientDto.toEntity(dto)));
        }

    }

    @Override
    public ClientDto findById(Integer id) {

        if(id==null){
            log.error("id client est null");
            return null;
        }
        else {
            return clientRepository.findById(id)
                    .map(ClientDto::fromEntity)
                    .orElseThrow(()-> new EntityNotFounException("client non trouvee avec id" + id,ErrorCodes.CLIENT_NOT_FOUND));
        }

    }

    @Override
    public List<ClientDto> findAll() {

        return clientRepository.findAll()
                .stream()
                .map(ClientDto::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        if(id==null){
            log.error("id saisie est null");

        }

        clientRepository.deleteById(id);

    }
}
