package br.edu.ifba.agendatelefonica.service;

import java.util.List;

import br.edu.ifba.agendatelefonica.domain.dto.ContatoDto;

public interface AgendaService {

  void cadastrar(ContatoDto contatoDto);

  List<ContatoDto> getAllContatos();

  ContatoDto getOneContato(Long id);

  void deleteContato(Long id);

  void updateContato(Long id, ContatoDto contatoDto);
}
