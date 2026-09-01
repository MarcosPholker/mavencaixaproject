package model;

public class Cliente {
	private int id;
	private String nome;
	private String email;
	private String telefone;
	
	
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
	public String getName() {
		return nome;
	}
	public void setName(String name) {
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
