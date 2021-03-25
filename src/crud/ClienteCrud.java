package crud;

import interfaces.Repository;

public class ClienteCrud implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando o cliente");
    }

    @Override
    public void alterar() {
        System.out.println("Alterando o cliente");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo o cliente");
    }

    @Override
    public void listar() {
        System.out.println("Listando clientes");
    }
}
