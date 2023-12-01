package entorns.pkg9;

import java.util.Scanner;

public class Entorns9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un numero");
        double a = sc.nextInt();
        System.out.println("Di otro numero");
        int n = sc.nextInt();
        System.out.println(potencia(a, n));
        System.out.println(factorial(a));
    }
    static double potencia(double a, double n){
        return Math.pow(a, n);
    }
    static double factorial(double a){
        double f = 0;
        if (a == 1){
            f = 1;
        }
        else if( a > 1){
            f = a * factorial(a - 1);
        }
        return f;
    }
}
