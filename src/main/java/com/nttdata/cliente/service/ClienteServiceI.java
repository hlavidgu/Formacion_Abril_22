package com.nttdata.cliente.service;

import java.util.List;

import com.nttdata.cliente.entities.Cliente;

public interface ClienteServiceI {

	List<Cliente> listAll();

	Cliente crearCliente(Cliente cliente);

	/**
	 * Obtiene los clientes
	 */
	
}
