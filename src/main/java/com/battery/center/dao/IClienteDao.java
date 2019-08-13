package com.battery.center.dao;

import org.springframework.data.repository.CrudRepository;

import com.battery.center.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

	
}
