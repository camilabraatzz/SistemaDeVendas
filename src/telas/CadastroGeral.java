package telas;

import crud.ClienteCrud;
import crud.FuncionarioCrud;
import crud.ProdutoCrud;
import crud.VendaCrud;
import interfaces.Repository;
import models.Cliente;
import models.Funcionario;

import java.util.Scanner;

public class CadastroGeral {
    private final Repository repository;

    public CadastroGeral(Repository repository) {
        this.repository = repository;
    }
    public void inicializar() {
        Scanner sc = new Scanner(System.in);
        String tela = verificaTela();
        System.out.println("Informe a operação que você deseja realizar no sistema para a tela " + tela);
        System.out.println("""
                 1 - Cadastrar
                 2 - Editar
                 3 - Excluir
                 4 - Listar
                """);
        Integer decisao = sc.nextInt();
        if (decisao.equals(1)) {
            repository.salvar();
        } else if (decisao.equals(2)){
            repository.alterar();
        } else if (decisao.equals(3)) {
            repository.excluir();
        }else if (decisao.equals(4)) {
            repository.listar();
        }else{
            System.out.println("Você escolheu errado, seu apedeuta!");
        }
    }
    private String verificaTela(){
        if (this.repository instanceof ClienteCrud){
            return "Cliente";
        }else if (this.repository instanceof FuncionarioCrud) {
            return "Funcionário";
        }else if (this.repository instanceof ProdutoCrud) {
            return "Produto";
        }else if (this.repository instanceof VendaCrud) {
            return "Venda";
        }else{
            return "Nenhuma tela encontrada";
        }
    }
}
