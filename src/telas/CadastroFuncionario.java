package telas;

import crud.ProdutoCrud;
import models.Funcionario;
import crud.FuncionarioCrud;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroFuncionario {
        private List<Funcionario> funcionarios;

    public CadastroFuncionario() {
            this.funcionarios = new ArrayList<>();
        }

        public void cadastrarFuncionario() {
            Scanner sc = new Scanner(System.in);
            FuncionarioCrud funcionarioCrud = new FuncionarioCrud();
            Funcionario funcionario = new Funcionario();
            System.out.println("Iniciando cadastro de funcionários...");

            System.out.println("Informe o nome: ");
            funcionario.setNome(sc.nextLine());

            System.out.println("Informe o telefone: ");
            funcionario.setTelefone(sc.nextLine());

            System.out.println("Informe o endereço: ");
            funcionario.setEndereco(sc.nextLine());

            System.out.println("Informe o salário: ");
            funcionario.setSalario(sc.nextDouble());

            System.out.println("Informe o pis: ");
            funcionario.setPis(sc.nextLine());

            funcionarios.add(funcionario);

            funcionarioCrud.salvar();
            System.out.println("O funcionário " + funcionario.getNome() + " foi cadastrado com sucesso!");
            sc.nextLine();
            sc.close();
        }
            public void alterarFuncionario(){
                FuncionarioCrud funcionarioCrud = new FuncionarioCrud();
                funcionarioCrud.alterar();
            }
            public void excluirFuncionario(){
                FuncionarioCrud funcionarioCrud = new FuncionarioCrud();
                funcionarioCrud.excluir();
            }
            public void listarFuncionarios(){
                FuncionarioCrud funcionarioCrud = new FuncionarioCrud();
                this.funcionarios = new ArrayList<>();
                System.out.println(funcionarios);
                funcionarioCrud.listar();
        }
    }
