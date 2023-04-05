package br.edu.ifba.agendatelefonica.domain.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.edu.ifba.agendatelefonica.domain.exceptions.ContatoNotFoundException;
import br.edu.ifba.agendatelefonica.domain.response.ExceptionResponse;

@RestControllerAdvice
public class ResponseExceptionHandler {

  @ExceptionHandler(ContatoNotFoundException.class)
  public final ResponseEntity<?> handleNotFoundException(ContatoNotFoundException exception) {
    ExceptionResponse exceptionResponse = new ExceptionResponse(exception.getMessage());
    return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
  }
}
