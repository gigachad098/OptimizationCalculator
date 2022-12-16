import java.util.Scanner;
public class Main {
   public static void main (final String[] args) {
      final Scanner input = new Scanner(System.in, "US-ASCII");
      System.out.println("Please input your target function");
      final String targetFunction = input.next();
      System.out.println(Derive.powerRule(targetFunction));

//      final String optimized = optimizeFunction(targetFunction);

   }
}
