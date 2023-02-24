package com.gestioncinema.gestioncinemabackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.gestioncinema.gestioncinemabackend.entity.Film;
import com.gestioncinema.gestioncinemabackend.service.ICinemaInitService;

@SpringBootApplication
public class GestionCinemaBackendApplication implements CommandLineRunner{

	@Autowired
	private ICinemaInitService iCinemaInitService;
	
	//ajouter l'id à film
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionCinemaBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Film.class);
		iCinemaInitService.initVilles();
		iCinemaInitService.initCinemas();
		iCinemaInitService.initSalles();
		iCinemaInitService.initPlaces();
		iCinemaInitService.initSeances();
		iCinemaInitService.initCategories();
		iCinemaInitService.initFilms();
		iCinemaInitService.initProjections();
		iCinemaInitService.initTickets();
		
	}

}
