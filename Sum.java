// sum of the number using recursive method

class Sum{
	public static int sumOfDigits(int number){
		int sign = number < 0 ? -1 : 1;
		number = Math.abs(number);
    return sign * sumOfDigitsHelper(number);
	}
	public static int sumOfDigitsHelper(int number){
	  if(number==0){
			return 0;
		}
    return number % 10 + sumOfDigitsHelper(number / 10);
	}
	public static void main(String []args){
		System.out.println(sumOfDigits(-12300000));
	}
}
