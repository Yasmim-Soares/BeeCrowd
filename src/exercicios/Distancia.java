package exercicios;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int velocidade = sc.nextInt();

        int distancia = velocidade * 2;

        System.out.println(distancia + " minutos");

    }
}
