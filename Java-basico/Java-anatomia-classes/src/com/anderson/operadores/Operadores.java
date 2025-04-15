package com.anderson.operadores;

public class Operadores {

    public static void main(String[] args) {
        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero = + numero * -1;

        System.out.println(numero);

        numero = numero + 1;

        System.out.println(numero);

        numero++;

        System.out.println(numero);

        boolean variavel = true;

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);

        //Ternário
        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);
    }
}
