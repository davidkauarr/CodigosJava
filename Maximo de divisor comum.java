import java.util.Scanner;

public class MDC {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite o primeiro número: ");
      int a = sc.nextInt();
      System.out.print("Digite o segundo número: ");
      int b = sc.nextInt();

      int resto;
      while (b != 0) {
         resto = a % b;
         a = b;
         b = resto;
      }

      System.out.println("O MDC de " + a + " e " + b + " é " + a);
   }
}