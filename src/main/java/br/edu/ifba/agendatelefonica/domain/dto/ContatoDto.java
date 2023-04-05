package br.edu.ifba.agendatelefonica.domain.dto;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.agendatelefonica.domain.entities.Contato;
import br.edu.ifba.agendatelefonica.domain.entities.Numero;

public record ContatoDto(String nome, String email, List<NumeroDto> numeros) {

    public Contato toEntity() {
        List<Numero> n = new ArrayList<>();
        Contato contato = new Contato(nome, email);
        numeros.forEach(numeroDto -> n.add(numeroDto.toEntity()));
        contato.setNumeros(n);
        return contato;
    }
}
