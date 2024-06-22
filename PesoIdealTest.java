package gestao_tres;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PesoIdealTest {

    @Test
    public void testClassificarIMC() {
        PesoIdeal pesoIdeal = new PesoIdeal();

        // Testes para classificarIMC
        assertEquals("Abaixo do peso", pesoIdeal.classificarIMC(50, 1.75));
        assertEquals("Peso normal", pesoIdeal.classificarIMC(70, 1.75));
        assertEquals("Sobre peso", pesoIdeal.classificarIMC(85, 1.75));
        assertEquals("Obeso", pesoIdeal.classificarIMC(110, 1.75));
        assertEquals("Obeso mórbido", pesoIdeal.classificarIMC(130, 1.75));
    }
}
