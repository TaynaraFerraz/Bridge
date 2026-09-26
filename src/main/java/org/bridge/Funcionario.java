package org.bridge;

public abstract class Funcionario {

    protected RegimeTrabalho regimeTrabalho;
    protected float salariobase;

    public Funcionario(float salariobase) {
        this.salariobase = salariobase;
    }

    public void setRegimeTrabalho(RegimeTrabalho regimeTrabalho) {
        this.regimeTrabalho = regimeTrabalho;
    }

    public void setSalariobase(float salariobase) {
        this.salariobase = salariobase;
    }

    public abstract float calcularSalario();
}
