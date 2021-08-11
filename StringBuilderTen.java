public class StringBuilderTen{
		public static void main(String[]args){
		
		StringBuilder sb=new StringBuilder("");
		sb.append("ABC");
		sb.append("#");
		sb.append("DEF");
		sb.append("#");
		sb.append("GHI");
		int initialLength=sb.length();
		System.out.println("Length of the Initial String :"+initialLength);
		int index=sb.lastIndexOf("#");
		System.out.println("Last Index of the # is :"+index);
	
		
		
		
		
		
		}





}