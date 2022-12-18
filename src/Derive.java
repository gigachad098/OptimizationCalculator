public class Derive {
   public static String[] breakingFunctionUp(final String input) {
      final String[] temp = input.split("\\^", 2);
      final String[] test = new String[4];
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
            test[2] = "^";
            test[3] = String.valueOf(temp[1].charAt(j));
         } else {
            test[3] += String.valueOf(temp[1].charAt(j));
         }
      }
      return test;
   }

   public static String powerRule(final String input) {
      final String[] function = breakingFunctionUp(input);
      return (Integer.parseInt(function[0]) * Integer.parseInt(function[3])) + function[1] + function[2]
            + (Integer.parseInt(function[3]) - 1);
   }
   public static String polynomialMultiplication (final String input1, final String input2) {
      final String[] function1 = breakingFunctionUp(input1);
      final String[] function2 = breakingFunctionUp(input2);
      return (Integer.parseInt(function1[0]) * Integer.parseInt(function2[0])) + function1[1] + function1[2] + (Integer.parseInt(function1[3]) + Integer.parseInt(function2[3]));
   }
   public static String productRule (final String functionOne, final String functionTwo) {
      String temp = polynomialMultiplication(powerRule(functionOne), functionTwo) + " " + polynomialMultiplication(powerRule(functionTwo), functionOne);
      return polynomialSimplification(temp);
   }
   public static String polynomialSimplification (final String function) {
      String[] temp = function.split("\\s", 2);
      final String[] temp0Broke = breakingFunctionUp(temp[0]);
      final String[] temp1Broke = breakingFunctionUp(temp[1]);
      if (Integer.parseInt(temp0Broke[3]) == Integer.parseInt(temp1Broke[3])) {
         return (Integer.parseInt(temp0Broke[0]) + Integer.parseInt(temp1Broke[0])) + temp0Broke[1] + temp0Broke[2] + temp0Broke[3];
      }
      else return temp0Broke[0] + temp0Broke[1] + temp0Broke[2] + temp0Broke[3] + " + " + temp1Broke[0] + temp1Broke[1] + temp1Broke[2] + temp1Broke[3];
   }
}

