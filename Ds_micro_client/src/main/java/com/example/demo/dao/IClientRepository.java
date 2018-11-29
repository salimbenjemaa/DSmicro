package com.example.demo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.entities.Client;





public interface IClientRepository extends MongoRepository<Client, String>{
	
	

	
	
	
	public List<Client> findByCode(long code);
	
	@Query("{'born' : { '$gt' : ?0 }}")
	public List<Client> findByDateNaissance(Date d);

}
