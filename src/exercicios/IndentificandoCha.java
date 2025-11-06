package exercicios;
import java.util.Scanner;

public class IndentificandoCha {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
         int T = sc.nextInt();

         int resposta[] = new int[5];

         for(int i = 0; i < 5; i++){
            resposta[i] = sc.nextInt();
         }

         int chaCorreto = 0;
         for(int i = 0; i < 5; i++){
            if(resposta[i] == T){
                chaCorreto ++;
            }
         }

         System.out.println(chaCorreto);
        }
}
