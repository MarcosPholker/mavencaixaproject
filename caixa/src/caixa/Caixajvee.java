package caixa;

import javax.swing.JOptionPane;

public class Caixajvee {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		pedido.cliente = new Cliente(
				JOptionPane.showInputDialog("nome do cliente:"), 
				JOptionPane.showInputDialog("email do cliente:"),
				JOptionPane.showInputDialog("endereco do cliente:"));
		pedido.addproduct(JOptionPane.showInputDialog("Produto"), null, 0);
		
		System.out.println(pedido);
		System.out.println("teste commit");
	}

}
