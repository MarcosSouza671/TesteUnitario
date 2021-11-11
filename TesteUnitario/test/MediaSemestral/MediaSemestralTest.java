/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MediaSemestral;

import org.junit.Test;
import static org.junit.Assert.*;

public class MediaSemestralTest {

    @Test
    public void deveCalcularMediaNumerosPositivos() {
        MediaSemestral ms = new MediaSemestral();
        ms.setNota1(7.0);
        ms.setNota2(7.0);
        ms.setNota3(7.0);
        
        assertEquals(7.0, ms.calcular(), 0.0001);
}
}