package br.edu.ifba.agendatelefonica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifba.agendatelefonica.domain.dto.ContatoDto;
import br.edu.ifba.agendatelefonica.domain.entities.Contato;
import br.edu.ifba.agendatelefonica.repositories.AgendaRepository;

@Service
public class AgendaService {

  @Autowired
  private AgendaRepository repository;


  public void cadastrar(ContatoDto contatoDto) {

    Contato entity = contatoDto.toEntity();
    repository.save(entity);
  }
}
