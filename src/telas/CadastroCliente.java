package telas;

import models.Cliente;
import crud.ClienteCrud;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroCliente {
    private List<Cliente> clientes;
    Cliente cliente = new Cliente();
    public CadastroCliente() {
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCliente() {
        Scanner sc = new Scanner(System.in);

        ClienteCrud clienteCrud = new ClienteCrud();
        System.out.println("Iniciando cadastro de clientes...");

        System.out.println("Informe o nome: ");
        cliente.setNome(sc.nextLine());

        System.out.println("Informe o telefone: ");
        cliente.setTelefone(sc.nextLine());

        System.out.println("Informe o endereço: ");
        cliente.setEndereco(sc.nextLine());

        System.out.println("Informe o limite de crédito: ");
        cliente.setLimiteCredito(sc.nextDouble());

        clientes.add(cliente);

        clienteCrud.salvar();
        System.out.println("O cliente " + cliente.getNome() + " foi cadastrado com sucesso!");

        sc.nextLine();
        sc.close();
    }

    public void alterarCliente(){
        ClienteCrud clienteCrud = new ClienteCrud();
        clienteCrud.alterar();
    }
    public void excluirCliente(){
        ClienteCrud clienteCrud = new ClienteCrud();
        clienteCrud.excluir();
    }
    public void listarClientes(){
        ClienteCrud clienteCrud = new ClienteCrud();
        this.clientes = new ArrayList<>();
        clienteCrud.listar();
        System.out.println(clientes);
    }

}
