package caixa;

import java.util.ArrayList;


public class Pedido {
	Cliente cliente;
	ArrayList<Produto> produto = new ArrayList<>();
	private Double valorTotal = 0.0;
	
	public void addproduct(String name, Double price, int stock) {
		produto.add(new Produto(name, price, stock));
		valorTotal += price;
	}
	
	public void removeProduct(String nameproduct) {
		produto.removeIf(produto -> produto.getName().equals(nameproduct));
	}
	
	
	
	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return cliente +"\n"+ produto;
	}
}
