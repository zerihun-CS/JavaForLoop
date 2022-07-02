import java.util.Arrays;
import java.util.Scanner;

public class Forloop {
   public static void main(String[] args) {
      System.out.println("Hello world!");

      // for (initialExpression; testExpression; updateExpression) {
      // // body of the loop
      // }
      // int sum = 0;
      //
      //
      //
      // for (int a = 1; a<=20; a++){
      // sum = a+sum;
      // System.out.println(sum );
      //
      //
      // }

      Scanner scanner = new Scanner(System.in);

      String studentName[] = new String[3];

      int markList[] = new int[3];

      for (int i = 0; i < markList.length; i++) {
         System.out.println("please insert your name ");
         studentName[i] = scanner.next();
         System.out.println("hello " + studentName[i] + ": please insert mark for the subject Math");
         markList[i] = scanner.nextInt();

      }

      for (int i = 0; i < studentName.length; i++) {
         System.out.println("student name: " + studentName[i] + "the subject Math result:" + markList[i]);
      }

   }
}