package com.nttdata;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        int arreglo[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        String resultado = null;

        Scanner scan = new Scanner(System.in); //se utiliza para ingresar texto

        System.out.println("Ingrese numero: ");
        int numero = scan.nextInt();

        for(int i=0; i<arreglo.length; i++){
            if (arreglo[i] == numero) {
                resultado = "Encontrado !!!";
                break;
            } else {
                resultado = "No se ha encontrado…";
            }
        }

        System.out.println(resultado);

    }

}
