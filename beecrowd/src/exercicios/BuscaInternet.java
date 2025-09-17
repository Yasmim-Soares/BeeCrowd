package exercicios;

import java.util.Scanner;

public class BuscaInternet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
         
        int segundoLink = t * 2 ;
        int primeiroLink = segundoLink * 2;

        System.out.println(primeiroLink);

        sc.close();
    }
}
