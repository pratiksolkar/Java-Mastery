// Take any 5 random numbers and show the time of execution of that number's factorial using iterative & recursive loop numbers should be between 1 to 30. Use one constructor must. And don't use Random () function.

class Solution{
  
  int [] arr;
  long iterativeStartTime, iterativeEndTime;
  long recursiveStartTime, recursiveEndTime;
  
  Solution(int numCount){
    arr = new int [numCount];
    for(int i=0; i<arr.length; i++){
        arr[i]= (int) (System.nanoTime()/100%31)+1;
    }
  }
  
  int FactUsingForLoop(int num){ // iterative loop
    int f=1,i=1;
    for(;i<=num; f*=i++);
    return f;
  }
  
  int FactUsingRecursiveLoop(int num){ // recursive loop
    if(num==0){
      return 1; 
    }
    return num* FactUsingRecursiveLoop(num-1);
  }
  
  void calculateTime(){
  
    iterativeStartTime = System.nanoTime();  /// for iterative
    for(int data : arr){
      FactUsingForLoop(data);
    }
    iterativeEndTime = System.nanoTime();
    
    recursiveStartTime = System.nanoTime();  /// for recursive
    for(int data : arr){
      FactUsingRecursiveLoop(data);
    }
    recursiveEndTime = System.nanoTime(); 
  }
  
  public String toString(){
    return "Time required to iterative loop: "+ (iterativeEndTime-iterativeStartTime) + "\n" + "Time required to recursive loop: "+ (recursiveEndTime-recursiveStartTime);
  }
  
}

public class CalculateSpeed{
  public static void main(String[] args){
    Solution s = new Solution(5);
    s.calculateTime();
    System.out.println(s);
  }
}
