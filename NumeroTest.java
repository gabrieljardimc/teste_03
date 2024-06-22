package gestao_tres;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NumeroTest {

    @Test
    public void testRaizCubica() {
        Numero numero = new Numero();

        // Teste para raizCubica
        assertEquals(3.0, numero.raizCubica(27.0), 0.0);
        assertEquals(2.71, numero.raizCubica(20.0), 0.01);
    }

    @Test
    public void testFatorial() {
        Numero numero = new Numero();

        // Teste para fatorial
        assertEquals(120, numero.fatorial(5));
        assertEquals(1, numero.fatorial(0));
    }

    @Test
    public void testSomaIntervalo() {
        Numero numero = new Numero();

        // Teste para somaIntervalo
        assertEquals(15, numero.somaIntervalo(5));
        assertEquals(0, numero.somaIntervalo(0));
    }
}
