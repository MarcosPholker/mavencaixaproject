package caixa;

public class Produto {
	private String name;
	private Double price;
	private int stock = 0;
	
	public String getName() {
		return name;
	}
	
	
	public Produto(String name, Double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}


	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}


	@Override
	public String toString() {
		return "Produto name=" + name + ", price=" + price + ", stock=" + stock;
	}
	
	
	
}
