package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UsuarioDTO;
import com.example.demo.exception.UsuarioNotFoundException;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuariorepository) {
		this.usuarioRepository = usuariorepository;
	}
	
	public Usuario cadastrarUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario(null, usuarioDTO.getNome(), usuarioDTO.getEmail(), usuarioDTO.getSenha());
		
		return usuarioRepository.save(usuario);
	}
	
	public Usuario buscarUsuarioId(Long id) {
		return usuarioRepository.findById(id).orElseThrow(() -> new UsuarioNotFoundException(id));
	}
	
	public List<Usuario> listarUsuarios(){
		return usuarioRepository.findAll();
	}
	
//	public Usuario Login(String email, String senha) {
//		List<Usuario> usuario = new ArrayList<>();
//	}
	
}
