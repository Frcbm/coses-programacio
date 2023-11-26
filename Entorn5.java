package entorn.pkg5;

import java.util.Scanner;

public class Entorn5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer numero");
        int x = sc.nextInt();
        System.out.println("Segundo numero");
        int y = sc.nextInt();
        funcio(x, y);
    }
    static void funcio(int x, int y){
        int m = x < y ? x : y;
        int m2 = x > y ? x : y;
        for (int i = m ; i <= m2 ; i++){
            System.out.println(i);
        }
    }
}
