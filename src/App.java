import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    

         Scanner imprime = new Scanner(System.in);
         System.out.println("Indique um número inteiro positivo:");
         int n = imprime.nextInt();
         System.out.println("numero: " + n);
         imprime.close();
         for(int i = 0; i <= n ; i++) {
            String out = "";
            for (int j = 0; j < i; j++) {
               out+=(j+1) ;
            }
            System.out.println(out);
        }
    }
   
}