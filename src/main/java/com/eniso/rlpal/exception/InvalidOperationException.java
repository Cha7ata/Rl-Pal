package com.eniso.rlpal.exception;

import lombok.Getter;

public class InvalidOperationException extends RuntimeException{
    @Getter
    private String errorMessages;

    public InvalidOperationException(String errorMessage) {
        super(errorMessage);
        this.errorMessages = errorMessage;
    }
}
