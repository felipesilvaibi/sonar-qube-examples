package com.sonarqube;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void TesteDeGolpe()
    {
        // Testando o golpe que tira 10 de vida
        String resultado1 = App.golpear(10);
        assertEquals("Tirou 10 de vida.", resultado1);

        // Testando o golpe que foi desviado
        String resultado2 = App.golpear(0);
        assertEquals("Desviou", resultado2);

        // Testando outro desvio
        String resultado3 = App.golpear(0);
        assertEquals("Desviou", resultado3);

        // Testando o golpe que tira 50 de vida
        String resultado4 = App.golpear(50);
        assertEquals("Tirou 50 de vida", resultado4);
    }
}
