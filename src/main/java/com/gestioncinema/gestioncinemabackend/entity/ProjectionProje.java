package com.gestioncinema.gestioncinemabackend.entity;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1",types= {com.gestioncinema.gestioncinemabackend.entity.Projection.class})
public interface ProjectionProje {

	public Long getId();
	public double getPrix();
	public Date getDateProjection();
	public Salle getSalle();
	public Film getFilm();
	public Seance getSeance();
	public Collection<Ticket> getTickets();
}
