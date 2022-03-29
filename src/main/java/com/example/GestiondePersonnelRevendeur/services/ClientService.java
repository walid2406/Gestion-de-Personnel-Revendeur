package com.example.GestiondePersonnelRevendeur.services;

import com.example.GestiondePersonnelRevendeur.dto.ClientDto;
import com.example.GestiondePersonnelRevendeur.utils.Constants;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.GestiondePersonnelRevendeur.utils.Constants.CLIENT_ENDPOINT;

public interface ClientService {

    ClientDto save(ClientDto dto);
    ClientDto findById(Integer id);
    List<ClientDto> findAll();
    void delete(Integer id);
}
