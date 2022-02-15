package com.mycompany.proxectofactura;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author a21manuelsg 
 */
public class ArtigoFacturaTest {
    
    public ArtigoFacturaTest() {
    }

    /**
     * Test of obterPrezoTotal method, of class ArtigoFactura.
     */
    @Test
    public void testObterPrezoTotal() {
        System.out.println("obterPrezoTotal");
        ArtigoFactura artigo = new ArtigoFactura("MP14","Rato inalámbrico",20,10);
        double resultadoEsperado = 200.0;
        double resultado = artigo.obterPrezoTotal();
        assertEquals(resultadoEsperado, resultado, 0.001);
    }
    
}
