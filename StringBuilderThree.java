public class StringBuilderThree{
	public static void main(String[]args){
		
		
			StringBuilder sb=new StringBuilder("God"+" "+"Great");
			int initialLength=sb.length();
			System.out.println("Initial Length :" +initialLength);
			StringBuilder add=sb.insert(4,"Is  ");
			System.out.println("String After Insertion :"+add);
			int finalLength=add.length();
			System.out.println("The Final String Length is :"+finalLength);
	
	
	
	}



}