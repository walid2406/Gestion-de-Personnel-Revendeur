package com.example.GestiondePersonnelRevendeur.exception;

import lombok.Getter;

public class EntityNotFounException extends RuntimeException {

    @Getter
    private ErrorCodes errorCodes;
    public EntityNotFounException(String message){
        super(message);
    }

    public EntityNotFounException(String message,Throwable cause){
        super(message,cause);
    }

    public EntityNotFounException(String message,Throwable cause,ErrorCodes errorCodes){
        super(message,cause);
        this.errorCodes=errorCodes;
    }

    public EntityNotFounException(String message,ErrorCodes errorCodes){
        super(message);
        this.errorCodes=errorCodes;
    }


}
