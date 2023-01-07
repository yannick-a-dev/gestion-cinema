package com.gestioncinema.gestioncinemabackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gestioncinema.gestioncinemabackend.entity.Ville;
@RepositoryRestResource
@CrossOrigin("*")
public interface VilleRepositoty extends JpaRepository<Ville, Long> {

}
