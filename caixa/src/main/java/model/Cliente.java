package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String email;
	private String telefone;
	
	public Cliente() {
	}

	public Cliente(String name, String email, String telefone) {
		this.nome = name;
		this.email = email;
		this.telefone = telefone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String name) {
		this.nome = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String address) {
		this.telefone = address;
	}

	@Override
	public String toString() {
		return "Cliente nome=" + nome + ", email=" + email + ", address=" + telefone;
	}
	
}
