// 001
// It give the sum of range from any starting num to end num

import java.util.Scanner;
class SumOfRange{
  public static void main( String args []){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the num1: ");
    int num1 = sc.nextInt();
    
    System.out.print("Enter the num1: ");
    int num2 = sc.nextInt();
    
    long sum =0;
    for(num1=num1; num1<=num2; num1++){
      sum += num1;
    }
    System.out.println("Sum of the range is " + sum);
  }
}
