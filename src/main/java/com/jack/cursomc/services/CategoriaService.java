package com.jack.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jack.cursomc.domain.Categoria;
import com.jack.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService
{	
	@Autowired
	private CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id)
	{	
		Categoria obj = repo.findOne(id);
		
		return obj;
	}
}
