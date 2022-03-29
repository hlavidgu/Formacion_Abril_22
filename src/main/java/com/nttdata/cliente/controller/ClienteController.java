package com.nttdata.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.cliente.dao.impl.ClienteDaoImpl;
import com.nttdata.cliente.entities.Cliente;
import com.nttdata.cliente.service.ClienteServiceI;

/*
 * Controlador del cliente
 */
@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteServiceI clienteService;
	
	@Autowired
	private ClienteDaoImpl clienteDao;
	
	@GetMapping("/listAll")
	public List<Cliente> list(){
//		List<Cliente> a =clienteService.listAll(); 
		return clienteService.listAll();
	}
	
    @GetMapping("/listarTodo")
    public List<Cliente> listAll() {
        return clienteDao.findAll();
    }
	
	@PostMapping("/crearCliente")
	public ResponseEntity<?> crearCliente(@RequestBody Cliente cliente){
		Cliente guardado = clienteService.crearCliente(cliente);
		return ResponseEntity.ok(guardado);
	}
}
