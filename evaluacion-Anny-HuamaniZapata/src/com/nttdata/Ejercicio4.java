package com.nttdata;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //se utiliza para ingresar texto
        int resultado = 0;

        System.out.println("Ingresar primer numero");
        int num1 = scan.nextInt();

        System.out.println("Ingresar segundo numero");
        int num2 = scan.nextInt();

        scan.nextLine();

        System.out.println("Ingresar operador");
        String oper = scan.nextLine();

        switch (oper){
            case "+":
                resultado = num1+num2;
                break;
            case "-":
                resultado = num1-num2;
                break;
            case "/":
                resultado = num1/num2;
                break;
            case "%":
                resultado = num1%num2;
                break;
            default:
                System.out.println("Operador invalido");
        }

        System.out.println("El resultado de " + num1 + " " + oper + " " + num2 + " " + "es " + resultado);

    }

}
