package com.example.demo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface JugadorRepository extends CrudRepository<Jugador, Integer> {

	List<Jugador> findByPartida(int partidaId);
	
}
