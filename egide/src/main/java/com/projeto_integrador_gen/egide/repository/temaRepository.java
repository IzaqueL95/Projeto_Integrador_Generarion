package com.projeto_integrador_gen.egide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto_integrador_gen.egide.model.Tema;

@Repository

public interface temaRepository extends JpaRepository<Tema, Long> {
	
	public List<Tema> findAllByIdTemaContaining (Long idTema);

}
