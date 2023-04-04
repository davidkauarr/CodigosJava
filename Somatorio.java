import java.util.Scanner;

public class SomaConjunto {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite a quantidade de números a serem somados: ");
      int n = sc.nextInt();

      int soma = 0;
      for (int i = 1; i <= n; i++) {
         System.out.print("Digite o " + i + "º número: ");
         int numero = sc.nextInt();
         soma += numero;
      }
      System.out.println("A soma dos números é: " + soma);
   }
}