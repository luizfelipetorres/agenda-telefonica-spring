package br.edu.ifba.agendatelefonica.domain.dto;

import br.edu.ifba.agendatelefonica.domain.entities.Numero;
import br.edu.ifba.agendatelefonica.domain.enums.Categoria;

public record NumeroDto(String telefone, Categoria categoria) {

  Numero toEntity() {
    return new Numero(telefone, categoria);
  }
}
