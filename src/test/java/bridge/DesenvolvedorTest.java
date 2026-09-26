package bridge;

import org.bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesenvolvedorTest {

    @Test
    void deveRetornarSalarioDesenvolvedorEstagio(){
        RegimeTrabalho regime = new Estagio();
        Desenvolvedor desenvolvedor = new Desenvolvedor(3000.0f);
        desenvolvedor.setRegimeTrabalho(regime);
        desenvolvedor.setDiasPlantao(10);
        assertEquals(4000.0f, desenvolvedor.calcularSalario());
    }

    @Test
    void deveRetornarSalarioDesenvolvedorCLT(){
        RegimeTrabalho regime = new CLT();
        Desenvolvedor desenvolvedor = new Desenvolvedor(3000.0f);
        desenvolvedor.setRegimeTrabalho(regime);
        desenvolvedor.setDiasPlantao(10);
        assertEquals(4300.0f, desenvolvedor.calcularSalario());
    }

    @Test
    void deveRetornarSalarioDesenvolvedorPJ(){
        RegimeTrabalho regime = new PJ();
        Desenvolvedor desenvolvedor = new Desenvolvedor(3000.0f);
        desenvolvedor.setRegimeTrabalho(regime);
        desenvolvedor.setDiasPlantao(10);
        assertEquals(4600.0f, desenvolvedor.calcularSalario());
    }
}
