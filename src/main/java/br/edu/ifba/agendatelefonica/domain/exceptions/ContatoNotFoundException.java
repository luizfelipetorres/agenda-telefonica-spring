package br.edu.ifba.agendatelefonica.domain.exceptions;

public class ContatoNotFoundException extends Exception {

  public ContatoNotFoundException() {
    super("Contato não encontrado na base de dados!");
  }
}
