import java.util.*;

class ArrayWithSorting {

   // function to print half of the array in
   // ascending order and the other half in
   // descending order
   static void printOrder(int[] a, int n) {
      int temp;

      // BUCKET SORT lOGIC IMPLEMENTATION
      for (int i = 0; i < n - 1; i++) {
         // first half sort with ascending order 
         for (int j = 0; j < n / 2 -1; j++) {
            if (a[j] > a[j + 1]) {
               temp = a[j];
               a[j] = a[j + 1];
               a[j + 1] = temp;
            }
         }

         for (int j = n / 2; j < n - 1; j++) {
            // second half sort with descending order 
            if (a[j] < a[j + 1]) {
               temp = a[j];
               a[j] = a[j + 1];
               a[j + 1] = temp;
            }
         }
      }

      for (int i = 0; i < n; i++)
         System.out.print(a[i] + " ");

   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int arr_size = 0;
      if (sc.hasNextInt()) {
         arr_size = sc.nextInt();
      }

      int[] arr = new int[arr_size];

      System.out.println(  "Enter the elements of the array: ");
      for (int i = 0; i < arr_size; i++) {
         if (sc.hasNextInt()) {
            arr[i] = sc.nextInt();
         }
      }
      printOrder(arr, arr_size);
      sc.close();
   }
}
