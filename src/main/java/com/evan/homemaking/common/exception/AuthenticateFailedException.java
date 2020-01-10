package com.evan.homemaking.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;

/**
 * @ClassName AuthenticateException
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/7 20:28
 */
public class AuthenticateFailedException extends HomemakingException {
    public AuthenticateFailedException(String message) {
        super(message);
    }

    public AuthenticateFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    @NonNull
    @Override
    public HttpStatus getStatus() {
        return HttpStatus.UNAUTHORIZED;
    }
}
