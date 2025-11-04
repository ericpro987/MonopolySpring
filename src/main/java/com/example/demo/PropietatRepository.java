package com.example.demo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PropietatRepository extends CrudRepository<Propietat, Integer> {

  List<Propietat> findByJugador_Id(int jugadorId);
}
