package entorns;

import java.util.Scanner;

public class Entorns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un numero");
        int a = sc.nextInt();
        System.out.println("Otro numero");
        int b = sc.nextInt();
        System.out.println("Otro numero");
        int c = sc.nextInt();
        
        funcio(a, b, c);
    }
    static void funcio(int a, int b, int c){
        System.out.println(calcul(a, b , c));
    }
    static int calcul(int a, int b, int c){
        int m = a > b ? a : b;
        int m2 = m > c ? m : c;
        return m2;
    }
    
}
