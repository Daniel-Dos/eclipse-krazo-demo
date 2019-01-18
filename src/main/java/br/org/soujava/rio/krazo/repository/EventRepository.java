package br.org.soujava.rio.krazo.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import br.org.soujava.rio.krazo.modelo.Evento;

@Repository
public interface EventRepository extends EntityRepository<Evento, Long> { }