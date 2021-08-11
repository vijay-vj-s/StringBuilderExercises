public class StringBuilderTwo{
	public static void main(String []args){
	StringBuilder sb=new StringBuilder("XYZ");
	int emptyStringLength=sb.length();
	System.out.println("Length of the Empty String is :"+emptyStringLength);
	sb.append("#");
	sb.append("ABC");
	sb.append("#");
	sb.append("DEF");
	sb.append("#");
	sb.append("GHI");
	sb.append("#");
	StringBuilder finalString=sb.append("JKL");
	int lengthAfterAppend=sb.length();
	System.out.println("The Final String is :"+finalString);
	System.out.println("Length of the Append String :"+lengthAfterAppend);
	
	
	
	
	
	}



}