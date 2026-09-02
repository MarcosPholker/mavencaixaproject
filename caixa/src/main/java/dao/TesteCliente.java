package dao;

import model.Cliente;
import model.Produto;

public class TesteCliente {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Marcos",
                "marcos@email.com",
                "11999999999"
        );
        Produto produto = new Produto("caneta", 1.50, 10);
        ProdutoDAO pdao = new ProdutoDAO();

        
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
        
        //System.out.println(dao.buscarPorId(14).toString());
        //System.out.println("teste todos os clientes na tela");
        //System.out.println(dao.listarClientes()+"\n");
        
        
        //pdao.addProduto(produto);
        //pdao.addProduto(new Produto("lapis", 1.10, 20));
        
        
        
        //System.out.println(pdao.buscarPorId(2));
        
        //produto.setName("macarrao");
        
        //pdao.attProduto(produto);
        
        System.out.println(pdao.listarProdutos());
        
        pdao.deletarProduto(3);
        
    }
}