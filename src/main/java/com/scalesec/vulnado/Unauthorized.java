package com.scalesec.vulnado;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
class Unauthorized extends RuntimeException {
    public Unauthorized(String exception) {
        super(exception);
    }
}
