package dao;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class TesteCliente {

    public static void main(String[] args) {

        // ============================================================
        // 1 - CRIANDO O CLIENTE
        // ============================================================
        
        Cliente cliente = new Cliente(
                "Marcos",
                "marcos@email.com",
                "11999999999"
        );

        // Criamos o DAO responsável pelo Cliente
        ClienteDAO clienteDAO = new ClienteDAO();

        // Salvamos o Cliente no banco
        // Isso é importante porque o Pedido vai precisar desse Cliente
        clienteDAO.inserirCliente(cliente);


        // ============================================================
        // 2 - CRIANDO OS PRODUTOS
        // ============================================================

        // Criamos uma lista para guardar os produtos
        List<Produto> produtos = new ArrayList<Produto>();

        // Adicionamos os produtos na lista
        produtos.add(new Produto("Caneta", 2.50, 20));
        produtos.add(new Produto("Lapis", 1.50, 12));
        produtos.add(new Produto("Tesoura", 5.50, 15));


        // Criamos o DAO responsável pelos Produtos
        ProdutoDAO produtoDAO = new ProdutoDAO();

        // Salvamos todos os produtos da lista no banco
        produtoDAO.addProduto(produtos);


        // ============================================================
        // 3 - CRIANDO O PEDIDO
        // ============================================================

        Pedido pedido = new Pedido();

        // O Pedido pertence ao Cliente
        //
        // Aqui estamos dizendo:
        //
        // pedido.cliente = cliente
        //
        // Como o Cliente já foi salvo anteriormente,
        // o Pedido pode fazer referência a ele.
        pedido.setCliente(cliente);


        // ============================================================
        // 4 - CRIANDO O ITEM DO PEDIDO
        // ============================================================

        ItemPedido itemPedido = new ItemPedido();

        // O ItemPedido pertence ao Pedido
        //
        // Estamos dizendo:
        //
        // itemPedido.pedido = pedido
        itemPedido.setPedido(pedido);


        // O ItemPedido possui os produtos
        //
        // Aqui estamos passando a lista de produtos
        // que criamos anteriormente.
        itemPedido.setProduto(produtos);


        // ============================================================
        // 5 - COLOCANDO O ITEM DENTRO DO PEDIDO
        // ============================================================

        // Criamos uma lista de ItemPedido
        List<ItemPedido> itensPedido = new ArrayList<ItemPedido>();

        // Colocamos nosso ItemPedido dentro da lista
        itensPedido.add(itemPedido);

        // Agora dizemos que o Pedido possui essa lista de itens
        //
        // pedido.itemPedido = itensPedido
        pedido.setItemPedido(itensPedido);


        // ============================================================
        // 6 - SALVANDO O PEDIDO
        // ============================================================

        // Criamos o DAO responsável pelo Pedido
        PedidoDAO pedidoDAO = new PedidoDAO();

        // Agora salvamos o Pedido
        //
        // O Cliente já existe no banco, então o Pedido
        // consegue utilizar o ID dele como cliente_id.
        pedidoDAO.inserirDados(pedido);


        // ============================================================
        // 7 - SALVANDO O ITEM DO PEDIDO
        // ============================================================

        // Criamos o DAO responsável pelo ItemPedido
        ItemPedidoDAO itemPedidoDAO = new ItemPedidoDAO();

        // Agora salvamos o ItemPedido
        //
        // O Pedido já foi salvo anteriormente,
        // então o ItemPedido consegue utilizar o ID do Pedido.
        itemPedidoDAO.addItemPedido(itensPedido);


        // ============================================================
        // RESUMO DA ORDEM
        // ============================================================
        //
        // Cliente
        //    ↓
        // salva primeiro
        //
        // Produto
        //    ↓
        // salva primeiro
        //
        // Pedido
        //    ↓
        // aponta para o Cliente
        //
        // ItemPedido
        //    ↓
        // aponta para o Pedido
        //    ↓
        // possui os Produtos
        //
        // ============================================================

    }
}
