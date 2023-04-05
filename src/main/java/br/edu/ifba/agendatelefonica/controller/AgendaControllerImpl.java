package br.edu.ifba.agendatelefonica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifba.agendatelefonica.domain.dto.ContatoDto;
import br.edu.ifba.agendatelefonica.service.AgendaService;

@RestController
public class AgendaControllerImpl implements AgendaController {

  @Autowired
  private AgendaService service;

  @Override
  @PostMapping(path = "/cadastrar")
  public ResponseEntity<?> cadastrar(@RequestBody ContatoDto contatoDto) {

    service.cadastrar(contatoDto);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

}
