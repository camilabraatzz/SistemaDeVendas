package crud;

import interfaces.Repository;

public class VendaCrud implements Repository {

    @Override
    public void salvar() {
        System.out.println("Salvando a venda");
    }

    @Override
    public void alterar() {
        System.out.println("Alterando a venda");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo a venda");
    }

    @Override
    public void listar() {
        System.out.println("Listando vendas");
    }
}
