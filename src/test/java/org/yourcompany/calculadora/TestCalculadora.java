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

    @Test
    public void test4() {
    assertEquals(Integer.valueOf(15),Calculadora.sumaPrimersNumeros(5));
    assertEquals(Integer.valueOf(6),Calculadora.sumaPrimersNumeros(3));
    assertEquals(Integer.valueOf(1),Calculadora.sumaPrimersNumeros(1));
    }

    @Test
    public void test5() {
    assertEquals(Integer.valueOf(55),Calculadora.sumaQuadrats(5));
    assertEquals(Integer.valueOf(14),Calculadora.sumaQuadrats(3));
    assertEquals(Integer.valueOf(1),Calculadora.sumaQuadrats(1));
    }

    @Test
    public void test6() {
    assertEquals(1.0,Calculadora.preuCine(10.0,true,false),0.01);
    assertEquals(11.0,Calculadora.preuCine(10.0,false,true),0.01);
    assertEquals(9.5,Calculadora.preuCine(10.0,true,true),0.01);
    }
}
