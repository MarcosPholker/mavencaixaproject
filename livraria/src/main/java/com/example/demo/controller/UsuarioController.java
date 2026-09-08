package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UsuarioDTO;
import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;

import jakarta.validation.Valid;


@RestController
public class UsuarioController {
	private UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}

	@PostMapping("/usuario/cadastro")
	public ResponseEntity<Usuario> cadastrarUsuario(@Valid @RequestBody UsuarioDTO usuarioDTO) {
		Usuario usuario = usuarioService.cadastrarUsuario(usuarioDTO);
		
		return ResponseEntity.status(201).body(usuario);
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario buscarUsuarioID(@PathVariable Long id) {
		return usuarioService.buscarUsuarioId(id);
	}
	
	@GetMapping("/usuario")
	public List<Usuario> listarUsuarios(){
		return usuarioService.listarUsuarios();
	}
	
}
