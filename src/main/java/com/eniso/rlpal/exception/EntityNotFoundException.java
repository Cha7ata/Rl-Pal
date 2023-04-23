package com.eniso.rlpal.exception;


import lombok.Getter;

public class EntityNotFoundException extends RuntimeException {
    @Getter
    private String errorMessages;


    public EntityNotFoundException(String errorMessage) {
        super(errorMessage);
        this.errorMessages=errorMessage;

    }

}
