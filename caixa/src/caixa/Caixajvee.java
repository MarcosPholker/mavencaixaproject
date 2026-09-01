package caixa;

import javax.swing.JOptionPane;

public class Caixajvee {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		pedido.cliente = new Cliente(
				JOptionPane.showInputDialog("nome do cliente:"), 
				JOptionPane.showInputDialog("email do cliente:"),
				JOptionPane.showInputDialog("endereco do cliente:"));
		
		
		
		String newPedido;
		do {
			pedido.addproduct(JOptionPane.showInputDialog("Produto"), Double.parseDouble(JOptionPane.showInputDialog("preco")), Integer.parseInt(JOptionPane.showInputDialog("quantidade")));
			newPedido = JOptionPane.showInputDialog("deseja continuar o pedido? (s/n)");
			System.out.println(newPedido);
		}while (!"n".equals(newPedido));
	
		
		System.out.println(pedido);
	}

}
