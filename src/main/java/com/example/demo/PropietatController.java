package com.example.demo;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // eso signfica que es un controller
@RequestMapping(path = "/monopoly/propietat") // esto es el path de la RAIZ de la API
    public class PropietatController {
	@Autowired // creanme
	private PropietatRepository repository;

	@GetMapping(path = "/hola")
	public @ResponseBody String test() {
		return "Hola";
	}

/*	@GetMapping(path = "/add") // esto es si accedo a la url /add
	public @ResponseBody String addNewBocata(@RequestParam String nombre, @RequestParam double precio,
			@RequestParam String receta) {
		Bocata b = new Bocata();
		b.setNombre(nombre);
		b.setPrecio(precio);
		b.setReceta(receta);
		repository.save(b);
		return "<h2>Todo ha salido a pedir de Milhouse</h2>"; // las respuestas de String se consideran respuestas en
																// HTML

	}

	@GetMapping(path = "/nombre/{nombre}")
	public @ResponseBody Iterable<Bocata> getBocatasConNombre(@PathVariable String nombre) {
		Iterable<Bocata> l = (repository.findAll());
		ArrayList<Bocata> l2 = new ArrayList<Bocata>();

		for (Bocata bocata : l) {
			if (bocata.getNombre().equals(nombre)) {
				l2.add(bocata);
			}

		}
		return l2;
	}

	@GetMapping(path = "/nombre2/{nombre}")
	public @ResponseBody Iterable<Bocata> getBocatasConNombre2(@PathVariable String nombre) {

		return repository.findByNombre(nombre);
	}

	@GetMapping(path = "/oferta/{precio}")
	public @ResponseBody Iterable<Bocata> getBocatasBaratos(@PathVariable double precio) {

		return repository.findByPrecioLessThan(precio);
	}

	@GetMapping(path = "/{id}")
	public @ResponseBody Bocata getBocata(@PathVariable int id) {
		Optional<Bocata> b = repository.findById(id);
		return b.get();

	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Bocata> getAllUsers() {
		return repository.findAll();// Toda clase de Java la devuelve como un JSON
	}

	@GetMapping(path = "/allPorPrecio")
	public @ResponseBody Iterable<Bocata> getAllUsersPorPrecio() {
		return repository.findAllByOrderByPrecioAsc();// Toda clase de Java la devuelve como un JSON
	}
*/

	@GetMapping(path = "/allPorJugador/{id}")
	public @ResponseBody Iterable<Propietat> getAllPropietatsPorJugador(@PathVariable int id) {
		return repository.findByJugador_Id(id);// Toda clase de Java la devuelve como un JSON
	}
}
