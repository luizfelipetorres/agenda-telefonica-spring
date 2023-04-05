package br.edu.ifba.agendatelefonica.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.ifba.agendatelefonica.domain.dto.ContatoDto;

public interface AgendaController {

  @PostMapping(path = "/cadastrar")
  ResponseEntity<?> cadastrar(@RequestBody ContatoDto contatoDto);
}
