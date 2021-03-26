import crud.ClienteCrud;
import crud.FuncionarioCrud;
import crud.ProdutoCrud;
import crud.VendaCrud;
import interfaces.Repository;
import telas.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Repository repository;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                     Qual tela você deseja abrir?
                     C - Cliente
                     F - Funcionário
                     P - Produto
                     V - Venda
                    """);
        String decisao = sc.next();
        if (decisao.equals("C")) {
            repository = new ClienteCrud();
            CadastroGeral cadastroGeral =  new CadastroGeral(repository);
            cadastroGeral.inicializar();
        } else if (decisao.equals("F")) {
            repository = new FuncionarioCrud();
            CadastroGeral cadastroGeral =  new CadastroGeral(repository);
            cadastroGeral.inicializar();
        } else if (decisao.equals("P")) {
            repository = new ProdutoCrud();
            CadastroGeral cadastroGeral =  new CadastroGeral(repository);
            cadastroGeral.inicializar();
        } else if (decisao.equals("V")) {
            repository = new VendaCrud();
            CadastroGeral cadastroGeral =  new CadastroGeral(repository);
            cadastroGeral.inicializar();
        } else {
            System.out.println("Você errou sua decisão, seu apedeuta!");
        }
    }
}
