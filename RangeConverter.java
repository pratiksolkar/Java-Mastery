// Calculate the range of the number from 'byte' or 'short'  

class RangeConverter{

  public int getNumber(int num, String type){
    if(type.equalsIgnoreCase("byte")){
      num %= 256;
      if(num > 127){
        num -= 256;
      }
      else if(num < -128){
        num += 256;
      }
      return num;
    } 
    else if(type.equalsIgnoreCase("short")){
      num %= 65536;
      if(num > 32767){
        num -= 65536;
      }
      else if(num < -32768){
        num += 65536;
      }
      return num;
    }
    return 0;
  }
  public static void main(String []args){
    RangeConverter obj = new RangeConverter();
    System.out.println(obj.getNumber(254683,"short"));
  }
  
}

