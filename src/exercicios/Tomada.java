package exercicios;
import java.util.Scanner;

public class Tomada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T1 = sc.nextInt();
        int T2 = sc.nextInt();
        int T3 = sc.nextInt();
        int T4 = sc.nextInt();

        int numeroTomadas = (T1 - 1) + (T2 - 1) + (T3 - 1) + T4;
        
        System.out.println(numeroTomadas);

        sc.close();
    }
}
