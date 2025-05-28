// string to integer

class StringToInteger{

  int strConverter(String num){
    String trimNum = num.trim();
    if(trimNum.contains("-")){
      trimNum = trimNum.substring(1);
    }
    int result = 0;
    for(int i=0; i< trimNum.length(); i++){
      int digit = trimNum.charAt(i)-'0';
      result = result * 10 + digit;
    }
    return result;
  }

  public static void main(String []args){
    StringToInteger obj = new StringToInteger();
    String strNum = "-023";
    System.out.println(obj.strConverter(strNum));
  }
  
}
