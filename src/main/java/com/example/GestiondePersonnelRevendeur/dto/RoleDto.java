package com.example.GestiondePersonnelRevendeur.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto {


    private Integer id;
    private String rolename;
    private PersonnelDto personnelDto;
}
