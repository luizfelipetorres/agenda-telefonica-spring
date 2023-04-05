package br.edu.ifba.agendatelefonica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifba.agendatelefonica.domain.dto.ContatoDto;
import br.edu.ifba.agendatelefonica.service.AgendaService;

@RestController
@RequestMapping(path = "/contatos")
public class AgendaControllerImpl implements AgendaController {

  @Autowired
  private AgendaService service;

  @Override
  @PostMapping
  public ResponseEntity<Void> postContato(@RequestBody ContatoDto contatoDto) {
    service.cadastrar(contatoDto);
    return ResponseEntity.status(HttpStatus.CREATED)
        .build();
  }

  @Override
  @GetMapping
  public ResponseEntity<List<ContatoDto>> getAllContatos() {
    return ResponseEntity.status(HttpStatus.OK)
        .body(service.getAllContatos());
  }

  @Override
  @GetMapping(path = "/{id}")
  public ResponseEntity<ContatoDto> getOneContato(@PathVariable Long id) {
    return ResponseEntity.ok(service.getOneContato(id));
  }

  @Override
  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Void> deleteContato(@PathVariable Long id) {
    service.deleteContato(id);
    return ResponseEntity.noContent()
        .build();
  }

  @Override
  @PutMapping(path = "/{id}")
  public ResponseEntity<Void> putContato(@PathVariable Long id,
      @RequestBody ContatoDto contatoDto) {
    service.updateContato(id, contatoDto);
    return ResponseEntity.noContent()
        .build();
  }
}
