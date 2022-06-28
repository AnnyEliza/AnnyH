package com.nttdata;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //se utiliza para ingresar texto

        System.out.println("Ingresar primera palabra: ");
        String palabra1 = scan.nextLine();
        System.out.println("Ingresar segunda palabra: ");
        String palabra2 = scan.nextLine();

        int longitud1 = palabra1.length();
        int longitud2 = palabra2.length();

        if (longitud1 > longitud2) {
            System.out.println("La palabra más grande es " + palabra1  + " de longitud " + longitud1);
        } else if (longitud2 > longitud1) {
            System.out.println("La palabra más grande es " + palabra2 + " de longitud " + longitud2);
        } else {
            System.out.println("Las palabras tienen el mismo tamaño");
        }

    }

}
