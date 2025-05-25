// Two non-negative integers num1 & num2 represented as strings, return the product of num1 & num2, also represented as a string
// Note : Without using any build-in library to convert the inputs into integer directly

import java.util.Scanner;
class Practice3{
  public static void main( String args[]){
    Scanner sc = new Scanner(System.in);
  
    System.out.print("Enter the num1 in string: ");
    String s1 = sc.nextLine();
        int num1 = 0;
        for(int i=0; i<s1.length(); i++){
          char c = s1.charAt(i);
          int digit = c - '0';
          num1 = num1 * 10 + digit;
        }
        
    System.out.print("Enter the num2 in string: ");
    String s2 = sc.nextLine();
        int num2 = 0;
        for(int i=0; i<s2.length(); i++){
          char c = s2.charAt(i);
          int digit = c - '0';
          num2 = num2 * 10 + digit;
        }
    int result = num1*num2;
    String result_str = Integer.toString(result);
    System.out.println("The product of num is : "+ "\"" + result_str + "\"");
  }
}
