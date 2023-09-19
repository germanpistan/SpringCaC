package org.example;

public class Main
{

    //PROGRAMACION FUNCIONAL
    //PRIMERO CREO INTERFACE CON METODO ABSTRACTO
    //LUEGO IMPLEMENTO CON LA FUNCION FECHA
    // SE PUEDE DECLARAR EN LA MISMA CLASE DONDE SE TRABAJA O EN OTRA, CONVIENE USARLA EN LA MISMA CLASE
    @FunctionalInterface
    interface calculabe {
        Integer operacion (Integer valor1, Integer valor2);
    }

    @FunctionalInterface
    interface calculabe2 {
        Integer operacion2 (Integer valor3, Integer valor4, Integer valor5, Integer valor6);
    }
    public static void main( String[] args ){


        //System.out.println(new Calculadora().suma(2,2)); FORMA VIEJA DE HACERLO, no funcional

        calculabe suma = (valor1, valor2) -> (valor1 + valor2);
        calculabe resta = (valor1, valor2) -> (valor1 - valor2);
        calculabe multiplicacion = (valor1, valor2) -> (valor1 * valor2);
        calculabe division = (valor1, valor2) -> (valor1 / valor2);

        System.out.println(suma.operacion(1,4));


    }

}
