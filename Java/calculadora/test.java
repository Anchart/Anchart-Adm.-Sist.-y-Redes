package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import calculadora.calculadora;
import org.junit.Test;

public class test {
    calculadora calculator = new calculadora ();

    @Test
    public void sumaTest1 (){
        assertEquals(calculator.sumar(2,2), 4);
    }
    @Test
    public void sumaTest2 () {
        assertNotEquals(calculator.sumar(2,2), 3);
    }

    @Test
    public void sumaTest3() {
        assertEquals(calculator.sumar(0, 0), 0);
    }

    @Test
    public void sumaTest4() {
        assertNotEquals(calculator.sumar(0, 0), 1);
    }
    @Test
    public void sumaTest5() {
        assertEquals(calculator.sumar(23,7), 30);
    }
    @Test
    public void sumaTest6()
    { assertEquals(calculator.sumar(33,77), 110);}
    @Test
    public void sumaTest7()
    { assertNotEquals(calculator.sumar(33,77), 100);}
    @Test
    public void restarTest1() {
        assertEquals(calculator.restar(1,1), 0);
    }
    @Test
    public void restarTest2() {
        assertNotEquals(calculator.restar(1,1), 2);
    }
    @Test
    public void restarTest3() {
        assertEquals(calculator.restar(0,0), 0);
    }
    @Test
    public void restarTest4() {
        assertNotEquals(calculator.restar(0,0), 1);
    }
    @Test
    public void restarTest5() {
        assertEquals(calculator.restar(1,2), -1);
    }
    @Test
    public void restarTest6() {
        assertNotEquals(calculator.restar(1,2), 1);
    }
    @Test
    public void dividirTest1() { assertEquals(calculator.dividir(4,2), 2);}
    @Test
    public void dividirTest2() { assertNotEquals(calculator.dividir(4,2), 1);}
    @Test (expected = ArithmeticException.class)
    public void dividirTest3() { calculator.dividir(1,0);}
    @Test
    public void dividirTest4() { assertNotEquals(calculator.dividir(1,6), 11);}
    @Test
    public void dividirTest5() { assertNotEquals(calculator.dividir(20,4), 4);}
    @Test
    public void dividirTest6() { assertEquals(calculator.dividir(20,4), 5);}
    @Test
    public void multiplicarTest1() { assertEquals(calculator.multiplicar(0,0), 0);}
    @Test
    public void multiplicarTest2() { assertEquals(calculator.multiplicar(0,1), 0);}
    @Test
    public void multiplicarTest3() { assertEquals(calculator.multiplicar(10,100), 1000);}
    @Test
    public void multiplicarTest4() { assertNotEquals(calculator.multiplicar(4,3), 10);}
    @Test
    public void multiplicarTest5() { assertEquals(calculator.multiplicar(78,1), 78);}
    @Test
    public void multiplicarTest6() { assertEquals(calculator.multiplicar(2,2), 4);}

}
