import java.util.Scanner;

public class ContaNumerosInteiros {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Digite o valor de N: ");
      int n = sc.nextInt();

      System.out.print("Digite o primeiro valor: ");
      int primeiroValor = sc.nextInt();

      int contador = 0;

      for (int i = primeiroValor; i <= n; i++) {
         if (i % 1 == 0) {
            contador++;
         }
      }

      System.out.println("Existem " + contador + " valores inteiros entre " + primeiroValor + " e " + n + ".");
   }
}