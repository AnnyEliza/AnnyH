package com.nttdata;

public class Ejercicio2 {

    public static void main(String[] args) {

        int numero, cont;

        numero = 17;
        cont = 0;

        for (int i = 1; i <= numero; i++){
            if (numero%i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

    }

}
