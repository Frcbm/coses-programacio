package entorns3;

import java.util.Scanner;

public class Entorns3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Elige 1 para sumar, 2 para multiplicar");
        int opcion = sc.nextInt();
        System.out.println("Cuantos numeros quieres introducir");
        int cantidad = sc.nextInt();
        funcio(cantidad, opcion);        
    }
    static void funcio( int cantidad, int opcion){
        switch(opcion){
            
            case 1:
                int suma = 0;
                for ( int i = 0 ; i < cantidad ; i++){
                   System.out.println("Escribe un numero");
                   int a = sc.nextInt();
                   suma += a;
                }
                System.out.println(suma);
                break;
            case 2:
                int producto = 1;
                for ( int i = 0 ; i < cantidad ; i++){
                   System.out.println("Escribe un numero");
                   int a = sc.nextInt();
                   producto *= a;
                }
                System.out.println(producto);
                break;
            default:
                System.out.println("No es una opcion correcta");
                break;
        }
    }
}
