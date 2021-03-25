package crud;

import interfaces.Repository;

public class FuncionarioCrud implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvar funcionário");
    }

    @Override
    public void alterar() {
        System.out.println("Alterar funcionário");
    }

    @Override
    public void excluir() {
        System.out.println("Excluir funcionário");
    }

    @Override
    public void listar() {
        System.out.println("Listando funcioários");
    }
}
