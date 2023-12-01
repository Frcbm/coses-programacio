package Entorns10.pkg;

import java.util.Scanner;

public class Entorns10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Escribe un numero de 8 digitos: ");
        int numero=sc.nextInt();          

        switch(numero%23){
            case 0 -> System.out.println(numero+"T");
            case 1 -> System.out.println(numero+"R");
            case 2 -> System.out.println(numero+"W");
            case 3 -> System.out.println(numero+"A");
            case 4 -> System.out.println(numero+"G");
            case 5 -> System.out.println(numero+"M");
            case 6 -> System.out.println(numero+"Y");
            case 7 -> System.out.println(numero+"F");
            case 8 -> System.out.println(numero+"P");
            case 9 -> System.out.println(numero+"D");
            case 10 -> System.out.println(numero+"X");
            case 11 -> System.out.println(numero+"B");
            case 12 -> System.out.println(numero+"N");
            case 13 -> System.out.println(numero+"J");
            case 14 -> System.out.println(numero+"Z");
            case 15 -> System.out.println(numero+"S");
            case 16 -> System.out.println(numero+"Q");
            case 17 -> System.out.println(numero+"V");
            case 18 -> System.out.println(numero+"H");
            case 19 -> System.out.println(numero+"L");
            case 20 -> System.out.println(numero+"C");
            case 21 -> System.out.println(numero+"K");
            case 22 -> System.out.println(numero+"E");
        }            
    }
}
