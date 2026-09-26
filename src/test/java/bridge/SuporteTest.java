package bridge;

import org.bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuporteTest {

    @Test
    void deveRetornarSalarioSuporteCLT(){
        RegimeTrabalho regime = new CLT();
        Suporte suporte = new Suporte(2000.0f);
        suporte.setRegimeTrabalho(regime);
        assertEquals(2000.0f, suporte.calcularSalario());
    }

    @Test
    void deveRetornarSalarioSuportePJ(){
        RegimeTrabalho regime = new PJ();
        Suporte suporte = new Suporte(2000.0f);
        suporte.setRegimeTrabalho(regime);
        assertEquals(2000.0f, suporte.calcularSalario());
    }

    @Test
    void deveRetornarSalarioSuporteEstagio(){
        RegimeTrabalho regime = new Estagio();
        Suporte suporte = new Suporte(2000.0f);
        suporte.setRegimeTrabalho(regime);
        assertEquals(2000.0f, suporte.calcularSalario());
    }
}
