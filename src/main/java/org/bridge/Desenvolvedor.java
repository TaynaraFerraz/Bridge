package org.bridge;

public class Desenvolvedor extends Funcionario {

    private int diasPlantao;

    public Desenvolvedor(float salariobase) {
        super(salariobase);
    }

    public void setDiasPlantao(int diasPlantao) {
        this.diasPlantao = diasPlantao;
    }

    @Override
    public float calcularSalario() {
        return this.salariobase * (1 + this.regimeTrabalho.percentualAumento()) + (this.diasPlantao * 100);
    }
}
