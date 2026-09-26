package org.bridge;

public class GerenteProjeto extends Funcionario {
    public GerenteProjeto(float salariobase) {
        super(salariobase);
    }

    @Override
    public float calcularSalario() {
        return this.salariobase * (1 + this.regimeTrabalho.percentualAumento());
    }
}
