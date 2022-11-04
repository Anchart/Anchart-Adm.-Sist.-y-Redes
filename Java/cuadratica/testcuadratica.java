package testcuadratica;

import cuatrica.cuadratica;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class testcuadratica {
    cuadratica calculator = new cuadratica ();

    @Test
    public void funcioncuadratica1(){

        float[] test = calculator.resolvente(2, 2, -312);
        float[] resultado = {12,-13};
        assertTrue(Arrays.equals(resultado,test));
    }
    @Test
    public void funcioncuadratica2(){

        float[] test = calculator.resolvente(2,2, -312);
        float[] resultado = {3,10};
        assertFalse(Arrays.equals(resultado,test));
    }
}

