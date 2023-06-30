package com.alekseyvideman.SpringJwtRestDemo.exceptions;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class CustomUsernameNotFoundException extends ResponseStatusException {
    public CustomUsernameNotFoundException(HttpStatusCode status, String reason) {
        super(status, reason);
    }
}
