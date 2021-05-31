import crud.ClienteCrud;
import crud.FuncionarioCrud;
import crud.ProdutoCrud;
import crud.VendaCrud;
import interfaces.Repository;
import models.Cliente;
import telas.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Repository repository;
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(count <= 4) {
            System.out.println("""
                     Qual tela você deseja abrir?
                     C - Cliente
                     F - Funcionário
                     P - Produto
                     V - Venda
                    """);
            String decisao = sc.next();
            switch (decisao) {
                case "C" -> {
                    repository = new ClienteCrud();
                    CadastroGeral cadastroGeral = new CadastroGeral(repository);
                    cadastroGeral.inicializar();
                    break;
                }
                case "F" -> {
                    repository = new FuncionarioCrud();
                    CadastroGeral cadastroGeral = new CadastroGeral(repository);
                    cadastroGeral.inicializar();
                    break;
                }
                case "P" -> {
                    repository = new ProdutoCrud();

                    CadastroGeral cadastroGeral = new CadastroGeral(repository);
                    cadastroGeral.inicializar();
                    break;
                }
                case "V" -> {
                    repository = new VendaCrud();
                    CadastroGeral cadastroGeral = new CadastroGeral(repository);
                    cadastroGeral.inicializar();
                    break;
                }
                default -> System.out.println("Você errou sua decisão, seu apedeuta!");
            }
        }
    }
}
