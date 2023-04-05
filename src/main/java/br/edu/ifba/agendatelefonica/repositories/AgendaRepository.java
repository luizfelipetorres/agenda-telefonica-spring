package br.edu.ifba.agendatelefonica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifba.agendatelefonica.domain.entities.Contato;

@Repository
public interface AgendaRepository extends JpaRepository<Contato, Long> {

}
