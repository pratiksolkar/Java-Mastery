// Total Palindrome numbers in a given range

class PalindromeNumInRange{
  String countPalindrome(int begNum, int endNum){
    int totalCount=0;
    int nonPalindrome=0;
        for(int i=begNum; i<=endNum; i++){
          String strNum = Integer.toString(i);
          int length = strNum.length();
              for(int j=0; j<=length/2; j++){
                if(strNum.charAt(j)==strNum.charAt((length--)-1)){
                  continue;
                }
                else{
                  nonPalindrome++;
                  break;
                }
              }
           totalCount++;
         }
    return totalCount-nonPalindrome+"";
  }
  public static void main( String args[]){
    PalindromeNumInRange obj = new PalindromeNumInRange();
    String result = obj.countPalindrome(11,22);
    System.out.println(result);
  }
}
