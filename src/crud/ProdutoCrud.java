package crud;

import interfaces.Repository;

public class ProdutoCrud implements Repository {

    @Override
    public void salvar() {
        System.out.println("Salvando o produto");
    }

    @Override
    public void alterar() {
        System.out.println("Alterando o produto");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo o produto");
    }

    @Override
    public void listar() {
        System.out.println("Listando produtos");
    }
}
