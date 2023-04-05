package br.edu.ifba.agendatelefonica.domain.entities;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contato {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String nome;
  private String email;
  @OneToMany(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "contato_id")
  private List<Numero> numeros;

  public Contato(String nome, String email) {
    this.nome = nome;
    this.email = email;
  }
}

