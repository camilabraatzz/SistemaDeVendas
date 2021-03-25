package telas;

import crud.VendaCrud;
import models.Venda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroVenda {
    private List<Venda> vendas;

    public CadastroVenda() {
        this.vendas = new ArrayList<>();
    }

    public void cadastrarVenda() {
        Scanner sc = new Scanner(System.in);
        VendaCrud vendaCrud = new VendaCrud();
        Venda venda = new Venda();
        System.out.println("Iniciando a venda...");

        System.out.println("Informe o nome do cliente: ");
        venda.setNome_cliente(sc.nextLine());

        System.out.println("Informe a descrição do produto: ");
        venda.setDescricao_produto(sc.nextLine());

        System.out.println("Informe o valor unitário: ");
        venda.setValor_unit(sc.nextDouble());

        vendas.add(venda);

        vendaCrud.salvar();
        System.out.println("A venda para o cliente" + venda.getNome_cliente() + " foi realizada com sucesso!");
        sc.nextLine();
        sc.close();
    }
    public void alterarVenda(){
        VendaCrud vendaCrud = new VendaCrud();
        vendaCrud.alterar();
    }
    public void excluirVenda(){
        VendaCrud vendaCrud = new VendaCrud();
        vendaCrud.excluir();
    }
    public void listarVenda(){
        VendaCrud vendaCrud = new VendaCrud();
        this.vendas = new ArrayList<>();
        System.out.println(vendas);
        vendaCrud.listar();
    }
}
