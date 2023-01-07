package com.gestioncinema.gestioncinemabackend.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    @Temporal(TemporalType.TIME)
	private Date heureDebut;
}
