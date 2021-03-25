package telas;

import crud.ClienteCrud;
import crud.FuncionarioCrud;
import models.Funcionario;
import models.Produto;
import crud.ProdutoCrud;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroProduto {
    private List<Produto> produtos;

    public CadastroProduto() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto() {
        Scanner sc = new Scanner(System.in);
        ProdutoCrud produtoCrud = new ProdutoCrud();
        Produto produto = new Produto();
        System.out.println("Iniciando cadastro de produtos...");

        System.out.println("Informe a descrição do produto: ");
        produto.setDescricao(sc.nextLine());

        System.out.println("Informe o valor unitário: ");
        produto.setValor_unit(sc.nextDouble());

        produtos.add(produto);

        produtoCrud.salvar();
        System.out.println("O produto " + produto.getDescricao() + " foi cadastrado com sucesso!");
        sc.nextLine();
        sc.close();
    }
    public void alterarProduto(){
        ProdutoCrud produtoCrud = new ProdutoCrud();
        produtoCrud.alterar();
    }
    public void excluirProduto(){
        ProdutoCrud produtoCrud = new ProdutoCrud();
        produtoCrud.excluir();
    }
    public void listarProduto(){
        ProdutoCrud produtoCrud = new ProdutoCrud();
        this.produtos = new ArrayList<>();
        System.out.println(produtos);
        produtoCrud.listar();
    }
}