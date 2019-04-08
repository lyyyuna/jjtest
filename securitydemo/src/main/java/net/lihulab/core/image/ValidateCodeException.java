package net.lihulab.core.image;

import org.springframework.security.core.AuthenticationException;

public class ValidateCodeException extends AuthenticationException {

    private static final long serialVersionUID = -433333333;

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
