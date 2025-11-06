package exercicios;

import java.util.Scanner;

public class SequenciaSecreta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sequencia[] = new int[N];

        
        for(int i = 0; i < N; i++){
            sequencia[i] = sc.nextInt();
            if(sequencia[i] > 2){
                break;
            } else if (sequencia[i] < 0){
                break;
            }
        }

        int numerosMarcados = 0;
        int ultimoMarcado = -1;
        for(int i = 0; i < N; i++){
            if(sequencia[i] != ultimoMarcado){
                numerosMarcados++;
                ultimoMarcado = sequencia[i];
            }
        }

        System.out.println(numerosMarcados);
    }
}
