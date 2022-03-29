package com.example.GestiondePersonnelRevendeur.controller.api;

import com.example.GestiondePersonnelRevendeur.dto.ClientDto;
import com.example.GestiondePersonnelRevendeur.utils.Constants;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.GestiondePersonnelRevendeur.utils.Constants.CLIENT_ENDPOINT;

@Api(CLIENT_ENDPOINT)
public interface ClientApi {


    @PostMapping(CLIENT_ENDPOINT+"/create")
    ClientDto save(@RequestBody ClientDto dto);
    @GetMapping(CLIENT_ENDPOINT+"/{id}")
    ClientDto findById(@PathVariable Integer id);
    @GetMapping(CLIENT_ENDPOINT+"/all")
    List<ClientDto> findAll();
    @DeleteMapping(CLIENT_ENDPOINT+"/{id}")
    void delete(@PathVariable Integer id);
}
