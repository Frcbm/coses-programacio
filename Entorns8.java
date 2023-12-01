package entorns8;

import java.util.Scanner;

public class Entorns8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int n = sc.nextInt();
        funcio(n);
    }
    static void funcio(int n){
        boolean esprimo = true;
        for( int i = n-1 ; i > 1; i-- ){
            if( n % i == 0){
                esprimo = false;
            }
        }
        if(esprimo){
            System.out.println("Es primo");
        }
        else {
            System.out.println("No es primo");
        }
    }
}
