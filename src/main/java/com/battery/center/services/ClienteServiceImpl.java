package com.battery.center.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.battery.center.dao.IClienteDao;
import com.battery.center.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Cliente cliente) {
		clienteDao.delete(cliente);
	}

	@Override
	@Transactional
	public Optional<Cliente> findById(long id) {
		return clienteDao.findById(id);
	}
	

}
