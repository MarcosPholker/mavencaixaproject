package model;

import java.util.ArrayList;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Pedido {
	
	@ManyToOne
	public Cliente cliente;
	
	@OneToMany
	ArrayList<Produto> produto = new ArrayList<>();
	
	public void addproduct(String name, Double price, int stock) {
		produto.add(new Produto(name, price, stock));
	}
	
	
	public void removeProduct(String nameproduct) {
		produto.removeIf(produto -> produto.getName().equals(nameproduct));
	}
	

	@Override
	public String toString() {
		return cliente +"\n"+ produto;
	}
}
