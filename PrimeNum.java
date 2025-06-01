// Given number is Prime or not

class PrimeNum{
  String isPrime(int num){
    int count=0;
    for(int i=1; i<=num; i++){
      if(num%i==0){
        count++;
      }
      else{
      }
    }
    if(count==2){
      return num+" is Prime";
    }
    else{
      return num+" is not Prime";
    } 
  }
  public static void main( String []args){
    PrimeNum obj = new PrimeNum();
    String result = obj.isPrime(11);
    System.out.println(result);
  }
}
