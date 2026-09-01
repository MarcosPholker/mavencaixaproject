package caixa;

import javax.swing.JOptionPane;

import dao.ClienteDAO;
import model.Cliente;
import model.Pedido;

public class Caixajvee {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		pedido.cliente = new Cliente(
				JOptionPane.showInputDialog("nome do cliente:"), 
				JOptionPane.showInputDialog("email do cliente:"),
				JOptionPane.showInputDialog("telefone:"));
		
		ClienteDAO cdao = new ClienteDAO();
		cdao.inserirCliente(pedido.cliente);
		
		
		String newPedido;
		do {
			pedido.addproduct(JOptionPane.showInputDialog("Produto"), Double.parseDouble(JOptionPane.showInputDialog("preco")), Integer.parseInt(JOptionPane.showInputDialog("quantidade")));
			newPedido = JOptionPane.showInputDialog("deseja continuar o pedido? (s/n)");
			System.out.println(newPedido);
		}while (!"n".equals(newPedido));
	
		
		System.out.println(pedido);
	}

}
