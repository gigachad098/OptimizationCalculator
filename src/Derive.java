import java.util.Arrays;

public class Derive {
   public static String[] breakingFunctionUp(final String input) {
      final String[] temp = input.split("\\^", 2);
      final String[] test = new String[3];
      for (int i = 0; i < input.length(); i++) {
         if ((Character.isDigit(temp[0].charAt(i))) && (i == 0)) {
            test[0] = String.valueOf(temp[0].charAt(i));
         } else if (Character.isDigit(temp[0].charAt(i))) {
            test[0] += String.valueOf(temp[0].charAt(i));
         } else {
            test[1] = String.valueOf(temp[0].charAt(i));
            break;
         }
      }
      for (int j = 0; j < temp[1].length(); j++) {
         if (j == 0) {
            test[2] = String.valueOf(temp[1].charAt(j));
         } else {
            test[2] += String.valueOf(temp[1].charAt(j));
         }
      }
      return test;
   }

   public static String powerRule(final String input) {
      final String[] function = breakingFunctionUp(input);
      return String.valueOf(Integer.parseInt(function[0]) * Integer.parseInt(function[2])) + function[1]
            + (Integer.parseInt(function[2]) - 1);
   }
   public static String polynomialMultiplication (final String input1, final String input2) {
      final String[] function1 = breakingFunctionUp(input1);
      final String[] function2 = breakingFunctionUp(input2);
      return String.valueOf(Integer.parseInt(function1[0]) + Integer.parseInt(function2[0])) + function1[1] + String.valueOf(Integer.parseInt(function1[2] + function2[2]));
   }
   public static String productRule (final String functionOne, final String functionTwo) {
      return polynomialMultiplication(powerRule(functionOne), functionTwo) + polynomialMultiplication(powerRule(functionTwo), functionOne);
   }
}

