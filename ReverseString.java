// Reverse the string "abcd" to "dcba" without use reverse() method

class ReverseString{

	String reverseStr(String text){
		if(text.isEmpty()){
			return text;
		}
		String reverseString = reverseStr(text.substring(1)) + text.charAt(0);
		return reverseString;
	}
	
	public static void main(String[] args){
		ReverseString obj = new ReverseString();
		System.out.println(obj.reverseStr("Pratik"));
	}
}
