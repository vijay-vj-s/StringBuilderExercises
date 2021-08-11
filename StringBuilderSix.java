public class StringBuilderSix{
	public static void main(String[]args){
	
	StringBuilder sb=new StringBuilder("god"+" "+"is"+" "+"great");
	int length=sb.length();
	System.out.println("Length of the String :"+length);
	StringBuilder reverse=sb.reverse();
	System.out.println("String After Reverse :" +reverse);
	int finalLength=sb.length();
	System.out.println("Length of the Reverse String :"+finalLength);
	
	
	}




}