// Given number is Palindrome or not 

class PalindromeNumber{
  
  String isPalindrome(int num){
    String strNum = Integer.toString(num);
    int length = strNum.length();
    
    for(int i=0; i<=length/2; i++){
        if(strNum.charAt(i)==strNum.charAt((length--)-1)){
          continue;
        }
        else{
          return "The num "+num+" is not Palindrome";
        }
     }
     return "The num "+num+" is Palindrome";
   }
  
   public static void main( String args[]){
     PalindromeNumber obj = new PalindromeNumber();
     String result = obj.isPalindrome(12321);
     System.out.println(result);
  }
  
}
