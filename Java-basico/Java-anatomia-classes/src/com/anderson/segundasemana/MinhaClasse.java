package com.anderson.segundasemana;

public class MinhaClasse {

    public static void main(String[] args) {
        //System.out.println("Hello World");
        final String BR = "Brasil";


//        String meuNome = "meu nome";
//
//        int anoFabricacao = 2022;
//
//        boolean simNao = true;
//
//        anoFabricacao = 2018;
        String primeiroNome = "Anderson";
        String segundoNome = "Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
