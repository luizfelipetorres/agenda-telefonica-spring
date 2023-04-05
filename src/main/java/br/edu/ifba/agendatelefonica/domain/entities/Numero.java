package br.edu.ifba.agendatelefonica.domain.entities;

import br.edu.ifba.agendatelefonica.domain.enums.Categoria;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Numero {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String telefone;
  @Enumerated(EnumType.STRING)
  private Categoria categoria;

  public Numero(String telefone, Categoria categoria) {
    this.telefone = telefone;
    this.categoria = categoria;
  }
}
