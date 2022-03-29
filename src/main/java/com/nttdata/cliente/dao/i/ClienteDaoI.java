package com.nttdata.cliente.dao.i;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.nttdata.cliente.entities.Cliente;
@EnableJpaRepositories
public interface ClienteDaoI extends JpaRepository<Cliente, Long> {

	List<Cliente> listAll();

	Cliente crearCliente(Cliente cliente);

}
