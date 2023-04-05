package br.edu.ifba.agendatelefonica.domain.dto;

import java.util.List;

import br.edu.ifba.agendatelefonica.domain.entities.Numero;
import br.edu.ifba.agendatelefonica.domain.enums.Categoria;

public record NumeroDto(String telefone, Categoria categoria) {

  public NumeroDto(Numero numero) {
    this(numero.getTelefone(), numero.getCategoria());
  }

  public static List<NumeroDto> toDto(List<Numero> numeros) {
    return numeros.stream()
        .map(NumeroDto::new)
        .toList();
  }

  public Numero toEntity() {
    return new Numero(telefone, categoria);
  }
}
