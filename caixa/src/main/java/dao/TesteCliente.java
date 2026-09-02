package dao;

import model.Cliente;

public class TesteCliente {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Marcos",
                "marcos@email.com",
                "11999999999"
        );

        
        ClienteDAO dao = new ClienteDAO();

        //dao.inserirCliente(cliente);

        //System.out.println("Cliente salvo!");
        //System.out.println("ID gerado: " + cliente.getId());
        
       // System.out.println("atualizando cliente!");
       // cliente.setNome("joao");
       // dao.attCliente(cliente);
        
        
        System.out.println("teste cliente deletado");
        
        dao.deletarCliente(9);
        
        dao.buscarPorId(14);
        
        System.out.println(dao.buscarPorId(14).toString());
        //System.out.println("teste todos os clientes na tela");
        //System.out.println(dao.listarClientes()+"\n");
        
    }
}