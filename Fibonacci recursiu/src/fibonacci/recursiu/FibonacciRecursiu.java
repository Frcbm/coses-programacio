package fibonacci.recursiu;

import java.util.Scanner;

public class FibonacciRecursiu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quina posicio de la successio de fibonacci vols saber?");
        int n = sc.nextInt();
        System.out.println("La posicio " + n + " de la successio de fibonacci es " + fibonacci(n - 1));
    }
    public static int fibonacci(int n){
        int resultat;
        if (n == 0){
            resultat = 0;
        }
        else if(n == 1){
            resultat = 1;
        }
        else {
            resultat = fibonacci(n - 1) + fibonacci(n - 2); 
        }
        return resultat;
    }
}
