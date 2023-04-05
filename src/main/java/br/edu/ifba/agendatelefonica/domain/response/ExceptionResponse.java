package br.edu.ifba.agendatelefonica.domain.response;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ExceptionResponse {

  private final LocalDateTime timestamp;
  private final String message;

  public ExceptionResponse(String message) {
    this.message = message;
    this.timestamp = LocalDateTime.now();
  }
}
