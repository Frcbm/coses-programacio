package entorns2;

import java.util.Scanner;

public class Entorns2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un numero");
        int x = sc.nextInt();
        
        funcio(x);
    }
    
    static void funcio(int x)
    {
        System.out.println(doble(x));
    }    
    static int doble(int x){
        return x * 2; 
    }
}
