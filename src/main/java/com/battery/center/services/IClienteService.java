package com.battery.center.services;

import java.util.List;
import java.util.Optional;

import com.battery.center.entity.Cliente;
 
public interface IClienteService {

	public List<Cliente> findAll();
	
	public Optional<Cliente> findById(long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Cliente cliente);
	
}
