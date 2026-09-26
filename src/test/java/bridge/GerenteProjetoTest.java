package bridge;

import org.bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GerenteProjetoTest {

    @Test
    void deveRetornarSalarioGerenteEstagio(){
        RegimeTrabalho regimeTrabalho = new Estagio();
        GerenteProjeto gerenteProjeto = new GerenteProjeto(5000.0f);
        gerenteProjeto.setRegimeTrabalho(regimeTrabalho);
        assertEquals(5000.0f, gerenteProjeto.calcularSalario());
    }

    @Test
    void deveRetornarSalarioGerenteCLT(){
        RegimeTrabalho regimeTrabalho = new CLT();
        GerenteProjeto gerenteProjeto = new GerenteProjeto(5000.0f);
        gerenteProjeto.setRegimeTrabalho(regimeTrabalho);
        assertEquals(5500.0f, gerenteProjeto.calcularSalario());
    }

    @Test
    void deveRetornarSalarioGerentePJ(){
        RegimeTrabalho regimeTrabalho = new PJ();
        GerenteProjeto gerenteProjeto = new GerenteProjeto(5000.0f);
        gerenteProjeto.setRegimeTrabalho(regimeTrabalho);
        assertEquals(6000.0f, gerenteProjeto.calcularSalario());
    }
}
