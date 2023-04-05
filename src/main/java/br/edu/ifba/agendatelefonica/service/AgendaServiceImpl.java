package br.edu.ifba.agendatelefonica.service;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifba.agendatelefonica.domain.dto.ContatoDto;
import br.edu.ifba.agendatelefonica.domain.entities.Contato;
import br.edu.ifba.agendatelefonica.domain.exceptions.ContatoNotFoundException;
import br.edu.ifba.agendatelefonica.repositories.AgendaRepository;
import lombok.SneakyThrows;

@Service
public class AgendaServiceImpl implements AgendaService {

  @Autowired
  private AgendaRepository repository;

  @Override
  public void cadastrar(ContatoDto contatoDto) {
    Contato entity = contatoDto.toEntity();
    repository.save(entity);
  }

  @Override
  public List<ContatoDto> getAllContatos() {
    return ContatoDto.toDto(repository.findAll());
  }

  @Override
  @SneakyThrows
  public ContatoDto getOneContato(Long id) {
    return repository.findById(id)
        .map(ContatoDto::new)
        .orElseThrow(ContatoNotFoundException::new);
  }

  @Override
  @SneakyThrows
  public void deleteContato(Long id) {
    Contato contato = repository.findById(id)
        .orElseThrow(ContatoNotFoundException::new);
    repository.delete(contato);
  }

  @Override
  @SneakyThrows
  public void updateContato(Long id, ContatoDto contatoDto) {
    repository.findById(id)
        .ifPresentOrElse(performUpdate(contatoDto), ContatoNotFoundException::new);
  }

  private Consumer<Contato> performUpdate(ContatoDto contatoDto) {
    return contato -> {
      contato.setNome(contatoDto.nome());
      contato.setEmail(contatoDto.email());
      repository.save(contato);
    };
  }
}
