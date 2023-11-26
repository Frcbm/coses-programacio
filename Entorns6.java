package entorns.pkg6;

import java.util.Scanner;

public class Entorns6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe a para el area o v para el volumen");
        String opcion = sc.nextLine().toLowerCase();
        System.out.println("Radio: ");
        double radio = sc.nextDouble();
        System.out.println("Altura: ");
        double altura = sc.nextDouble();
        funcio(opcion, radio, altura);
    }
    static void funcio(String opcion, double radio, double altura){
        switch(opcion){
            case "a":
                System.out.println("L'area es: " + area(radio, altura));
                break;
            case "v": 
                System.out.println("El volumen es: " + volumen(radio, altura));
                break;
            default:
                System.out.println("No es una opcio valida");
        }
    }
    static double area(double radio, double altura){
        return (2 * Math.PI) * radio * (altura + radio);
    }
    static double volumen(double radio, double altura){
        return Math.PI * Math.pow(radio,2) * altura;
    }
}
