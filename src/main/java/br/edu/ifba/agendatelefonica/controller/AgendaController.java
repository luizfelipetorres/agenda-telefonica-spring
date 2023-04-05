package br.edu.ifba.agendatelefonica.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.edu.ifba.agendatelefonica.domain.dto.ContatoDto;

public interface AgendaController {

  ResponseEntity<Void> postContato(ContatoDto contatoDto);

  ResponseEntity<List<ContatoDto>> getAllContatos();

  ResponseEntity<ContatoDto> getOneContato(Long id);

  ResponseEntity<Void> deleteContato(Long id);

  ResponseEntity<Void> putContato(Long id, ContatoDto contatoDto);

}
