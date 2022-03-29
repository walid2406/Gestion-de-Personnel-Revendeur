package com.example.GestiondePersonnelRevendeur.exception;

public enum ErrorCodes {

    CLIENT_NOT_FOUND(1000),
    CLIENT_NOT_VALID(1001),
    PERSONNEL_NOT_FOUND(2000),
    PERSONNEL_NOT_VALID(2001)
    ;


    private int code;

    ErrorCodes(int code){
        this.code=code;
    }

    public int getCode() {
        return code;
    }


}
