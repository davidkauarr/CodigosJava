import java.util.Scanner;

public class VerificaPrimo {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite um número inteiro positivo: ");
      int n = sc.nextInt();

      boolean primo = true;
      for (int i = 2; i <= n / 2; i++) {
         if (n % i == 0) {
            primo = false;
            break;
         }
      }
      if (primo) {
         System.out.println(n + " é um número primo.");
      } else {
         System.out.println(n + " não é um número primo.");
      }
   }
}