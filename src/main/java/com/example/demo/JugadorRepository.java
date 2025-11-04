package com.example.demo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface JugadorRepository extends CrudRepository<Jugador, Integer> {

    List<Jugador> findByPartida_Id(int partidaId);
	List<Propietat> findPropietatsById(int jugadorId);
    List<Propietat> findPropietatsListById(int jugadorId);
}
