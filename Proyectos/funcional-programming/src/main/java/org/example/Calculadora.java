package org.example;

public class Calculadora implements Operacionable{

    //forma de hacerlo no funcional, es decir, declarable
    @Override
    public Integer suma(Integer valor1, Integer valor2) {
        return valor1 + valor2;
    }

    @Override
    public Integer resta(Integer valor1, Integer valor2) {
        return valor1 - valor2;
    }

    @Override
    public Integer multiplicacion(Integer valor1, Integer valor2) {
        return valor1 * valor2;
    }

    @Override
    public Integer division(Integer valor1, Integer valor2) {
        return valor1 / valor2;
    }
}
