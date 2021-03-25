package telas;

import java.util.Scanner;

public class Login {
    public static void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                 Informe a operação que você deseja realizar no sistema
                 1 - Cadastrar
                 2 - Editar
                 3 - Excluir
                 4 - Listar
                """);
        Integer decisao = sc.nextInt();
        if (decisao.equals(1)) {
            System.out.println("""
                     O que você deseja cadastrar no sistema?
                     C - Cliente
                     F - Funcionário
                     P - Produto
                     V - Venda
                    """);
            String cadastro = sc.next();
            if (cadastro.equals("C")) {
                CadastroCliente cadatroCliente = new CadastroCliente();
                cadatroCliente.cadastrarCliente();
            } else if (cadastro.equals("F")) {
                CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
                cadastroFuncionario.cadastrarFuncionario();
            } else if (cadastro.equals("P")) {
                CadastroProduto cadastroProduto = new CadastroProduto();
                cadastroProduto.cadastrarProduto();
            }else if (cadastro.equals("V")) {
                CadastroVenda cadastroVenda = new CadastroVenda();
                cadastroVenda.cadastrarVenda();
            } else {
                System.out.println("Você errou sua decisão, seu apedeuta!");
            }
        } else if (decisao.equals(2)){
            System.out.println("""
                     O que você deseja editar no sistema?
                     C - Cliente
                     F - Funcionário
                     P - Produto
                     V - Venda
                    """);
            String edicao = sc.next();
            if (edicao.equals("C")){
                CadastroCliente cadastroCliente = new CadastroCliente();
                cadastroCliente.alterarCliente();
            }else if (edicao.equals("F")) {
                CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
                cadastroFuncionario.alterarFuncionario();
            }else if (edicao.equals("P")) {
                CadastroProduto cadastroProduto = new CadastroProduto();
                cadastroProduto.alterarProduto();
            }else if (edicao.equals("V")) {
                CadastroVenda cadastroVenda = new CadastroVenda();
                cadastroVenda.alterarVenda();
            } else {
                System.out.println("Você errou sua decisão, seu apedeuta!");
            }
        } else if (decisao.equals(3)) {
            System.out.println("""
                     O que você deseja excluir do sistema?
                     C - Cliente
                     F - Funcionário
                     P - Produto
                     V - Venda
                    """);
            String excluir = sc.next();
            if (excluir.equals("C")) {
                CadastroCliente cadastroCliente = new CadastroCliente();
                cadastroCliente.excluirCliente();
            } else if (excluir.equals("F")) {
                CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
                cadastroFuncionario.excluirFuncionario();
            } else if (excluir.equals("P")) {
                CadastroProduto cadastroProduto = new CadastroProduto();
                cadastroProduto.excluirProduto();
            } else if (excluir.equals("V")) {
                CadastroVenda cadastroVenda = new CadastroVenda();
                cadastroVenda.excluirVenda();
            } else {
                System.out.println("Você errou sua decisão, seu apedeuta!");
            }
        }else if (decisao.equals(4)) {
            System.out.println("""
                    O que você deseja listar?
                     C - Cliente
                     F - Funcionário
                     P - Produto
                     V - Venda
                    """);
            String listar = sc.next();
                if (listar.equals("C")) {
                    CadastroCliente cadastroCliente = new CadastroCliente();
                    cadastroCliente.listarClientes();
                } else if (listar.equals("F")) {
                    CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
                    cadastroFuncionario.listarFuncionarios();
                } else if (listar.equals("P")) {
                    CadastroProduto cadastroProduto = new CadastroProduto();
                    cadastroProduto.listarProduto();
                } else if (listar.equals("V")) {
                    CadastroVenda cadastroVenda = new CadastroVenda();
                    cadastroVenda.listarVenda();
                } else {
                    System.out.println("Você errou sua decisão, seu apedeuta!");
            }
        }
        sc.close();
    }
}
