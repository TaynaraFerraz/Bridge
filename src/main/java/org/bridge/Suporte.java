package org.bridge;

public class Suporte extends Funcionario {
    public Suporte(float salariobase) {
        super(salariobase);
    }

    @Override
    public float calcularSalario() {
        return this.salariobase;
    }
}
