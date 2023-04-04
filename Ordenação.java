import java.util.Arrays;

public class QuickSort {
   public static void main(String[] args) {
      int[] arr = { 5, 2, 9, 1, 5, 6, 3 };
      System.out.println("Array antes da ordenação: " + Arrays.toString(arr));

      quickSort(arr, 0, arr.length - 1);

      System.out.println("Array após a ordenação: " + Arrays.toString(arr));
   }

   public static void quickSort(int[] arr, int inicio, int fim) {
      if (inicio < fim) {
         int indicePivo = particiona(arr, inicio, fim);
         quickSort(arr, inicio, indicePivo - 1);
         quickSort(arr, indicePivo + 1, fim);
      }
   }

   public static int particiona(int[] arr, int inicio, int fim) {
      int pivo = arr[fim];
      int i = inicio - 1;

      for (int j = inicio; j < fim; j++) {
         if (arr[j] <= pivo) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
         }
      }

      int temp = arr[i + 1];
      arr[i + 1] = arr[fim];
      arr[fim] = temp;

      return i + 1;
   }
}