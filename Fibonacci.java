import java.util.Scanner;

public class Fibonacci {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite o número de termos da sequência de Fibonacci: ");
      int n = sc.nextInt();

      int primeiro = 1;
      int segundo = 1;
      System.out.print(primeiro + " " + segundo + " ");

      for (int i = 3; i <= n; i++) {
         int terceiro = primeiro + segundo;
         System.out.print(terceiro + " ");
         primeiro = segundo;
         segundo = terceiro;
      }
   }
}