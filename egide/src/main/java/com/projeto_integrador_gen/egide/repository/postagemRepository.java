package com.projeto_integrador_gen.egide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto_integrador_gen.egide.model.Postagem;


@Repository
public interface postagemRepository extends JpaRepository<Postagem,Long>{
	
	public List<Postagem> findAllByIdPostagemContaining (Long idPostagem);


}
