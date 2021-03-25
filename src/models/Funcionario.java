package models;

public class Funcionario extends Pessoa {
    private double salario;
    private String pis;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) { this.pis = pis; }
}

