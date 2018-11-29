package com.example.demo.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.IClientRepository;
import com.example.demo.entities.Client;


@RestController
public class ClientController {
	
	
	@Autowired
	IClientRepository clientRepository;
	
	
	
	@PostMapping("/save")	
	public Client save(Client client) {
		//Client c= clientRepository.findByCode(client.getCode()).get(0);
		//if(c== null)
			return clientRepository.save(client);
		//return null;
	}
	
	@RequestMapping("/delete")
	public boolean delete(long code)
	{
		Client c= clientRepository.findByCode(code).get(0);
		if(c!=null) {
			clientRepository.delete(c);
			return true; 
		}
		return false;
		
	}
	
	
	@RequestMapping("/update")
	public Client update(Client p)
	{
		clientRepository.save(p);
		return p; 
	}
	
	
	
	
	@GetMapping("getAll")
	public List<Client> listerProduit(){
		return clientRepository.findAll();
	}
	

	
	@RequestMapping("/getClientbycode")
	public Client getClientbyCode(long code)
	{
		return clientRepository.findByCode(code).get(0);
		 
	}
	
	@RequestMapping("/getClientbyDate")
	public List<Client> getClientbyDate(Date d)
	{
		return clientRepository.findByDateNaissance(d);
		 
	}
	
	

}
