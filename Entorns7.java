package entorns7;

import java.util.Scanner;

public class Entorns7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un numero");
        int n = sc.nextInt();
        funcio(n);
    }
    static void funcio(int n){
        
        for ( int i = 1 ; i <= n ; i++ ){
            if(n % i ==0){
                boolean esprimo = true;
                for( int j = i-1 ; j >= 2 ; j--){
                if ( i % j == 0){
                    esprimo = false;
                    break;
                }
            }
            if (esprimo){
                System.out.println(i);
            }
            }
            
        }
    }
}
