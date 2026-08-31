package caixa;

import java.util.ArrayList;


public class Pedido {
	Cliente cliente;
	ArrayList<Produto> produto = new ArrayList<>();
	
	public void addproduct(String name, Double price, int stock) {
		produto.add(new Produto(name, price, stock));
	}
	
	public void removeProduct(String nameproduct) {
		produto.removeIf(produto -> produto.getName().equals(nameproduct));
	}
	
	@Override
	public String toString() {
		return cliente +" "+ produto;
	}
}
