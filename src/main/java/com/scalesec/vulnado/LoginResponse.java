package com.scalesec.vulnado;

import java.io.Serializable;

class LoginResponse implements Serializable {
    public String token;

    public LoginResponse(String msg) {
        this.token = msg;
    }
}
