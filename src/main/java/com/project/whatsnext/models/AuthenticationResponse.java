package com.project.whatsnext.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class AuthenticationResponse {

  private final String jwt;

  public AuthenticationResponse(String jwt) {
    this.jwt = jwt;
  }

  public String getJwt() {
    return jwt;
  }
}
