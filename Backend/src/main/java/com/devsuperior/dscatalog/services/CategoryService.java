package com.devsuperior.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CatergoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CatergoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();

}
}