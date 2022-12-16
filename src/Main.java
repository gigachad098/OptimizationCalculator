import java.util.Scanner;
public class Main {
   public static void main (final String[] args) {
      final Scanner input = new Scanner(System.in, "US-ASCII");
      final String targetFunction = input.nextLine();
      final String targetFunction2 = input.nextLine();
      System.out.println(Derive.productRule(targetFunction, targetFunction2));

//      final String optimized = optimizeFunction(targetFunction);

   }
}
