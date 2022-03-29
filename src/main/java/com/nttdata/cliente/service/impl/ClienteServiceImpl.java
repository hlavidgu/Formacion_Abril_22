package com.nttdata.cliente.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.cliente.dao.i.ClienteDaoI;
import com.nttdata.cliente.entities.Cliente;
import com.nttdata.cliente.service.ClienteServiceI;

@Service
public class ClienteServiceImpl implements ClienteServiceI {
	
	@Autowired
	private ClienteDaoI clienteDao;

	@Override
	public List<Cliente> listAll() {
		return clienteDao.listAll();
	}

	@Override
	public Cliente crearCliente(Cliente cliente) {
		return clienteDao.crearCliente(cliente);
	}

}
