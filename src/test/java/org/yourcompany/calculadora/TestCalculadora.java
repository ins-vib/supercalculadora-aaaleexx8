package org.yourcompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalculadora {

    @Test
    public void test1() {
       assertEquals(3,Calculadora.nombreDigits(123));
       assertEquals(1,Calculadora.nombreDigits(1));
       assertEquals(1,Calculadora.nombreDigits(0));
       assertEquals(3,Calculadora.nombreDigits(-123));


    }

    @Test
    public void test2() {
    assertEquals(Integer.valueOf(24),Calculadora.calcularFactorial(4));
    assertEquals(Integer.valueOf(120),Calculadora.calcularFactorial(5));
    assertEquals(Integer.valueOf(720),Calculadora.calcularFactorial(6));
    assertEquals(Integer.valueOf(5040),Calculadora.calcularFactorial(7));
    }

    @Test
    public void test3() {
    assertEquals(Integer.valueOf(4), Integer.valueOf(Calculadora.calcularPotencia(4, 1)));
    assertEquals(Integer.valueOf(16), Integer.valueOf(Calculadora.calcularPotencia(4, 2)));
    assertEquals(Integer.valueOf(64), Integer.valueOf(Calculadora.calcularPotencia(4, 3)));
    assertEquals(Integer.valueOf(256), Integer.valueOf(Calculadora.calcularPotencia(4, 4)));
    }
}