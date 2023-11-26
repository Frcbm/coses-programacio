package entorns4;

import java.util.Scanner;

public class Entorns4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que tabla quieres ver");
        int tabla = sc.nextInt();
        System.out.println("Has donde quieres multiplicar");
        int n = sc.nextInt();
        funcion(tabla, n);
    }
    static void funcion(int tabla, int n){
        for( int i = 0; i <= n ; i++){
            System.out.println(tabla + " X " + i + " = " + tabla * i);
        }
    }
}
