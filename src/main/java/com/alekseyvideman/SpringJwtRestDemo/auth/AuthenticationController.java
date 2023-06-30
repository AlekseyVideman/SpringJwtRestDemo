package com.alekseyvideman.SpringJwtRestDemo.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

  private final AuthenticationService service;

  @PostMapping("/register")
  public ResponseEntity register(RegisterRequest request
  ) {
      service.register(request);
      return ResponseEntity.ok().build();
  }

  @PostMapping("/authenticate")
  public ResponseEntity<AuthenticationResponse> authenticate(AuthenticationRequest request
  ) {
    return ResponseEntity.ok(service.authenticate(request));
  }

}
