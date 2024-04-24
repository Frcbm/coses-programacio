package main;

import Dominio.Cuenta;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Cuenta cuenta = crearCuenta();
        System.out.println(cuenta.toString());

    }
    static Cuenta crearCuenta(){
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        System.out.print("Nombre: ");
        cuenta.setNombreTitular(sc.nextLine());
        System.out.print("Apellido: ");
        cuenta.setApellidoTitular(sc.nextLine());
        System.out.println("IBAN: ");
        cuenta.setIBAN(sc.nextLine());
        return cuenta;
    }
}