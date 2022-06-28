package com.nttdata;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //se utiliza para ingresar texto

        System.out.println("Ingresar primera palabra: ");
        String palabra1 = scan.nextLine();
        System.out.println("Ingresar segunda palabra: ");
        String palabra2 = scan.nextLine();

        if(palabra1.equals(palabra2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }

    }

}
