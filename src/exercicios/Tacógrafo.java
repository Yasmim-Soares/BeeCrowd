package exercicios;

import java.util.Scanner;

public class Tacógrafo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int tempo[] = new int[n];
        int velocidade[] = new int[n];

        int total = 0;
        for (int i = 0; i < n; i++){
            tempo[i] = sc.nextInt();
            velocidade[i] = sc.nextInt();
            total += tempo[i] * velocidade[i];
        }

        System.out.println(total);
    }
}
