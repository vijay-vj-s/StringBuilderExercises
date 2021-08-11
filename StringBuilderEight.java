public class StringBuilderEight{
		public static void main(String[]args){
		
		StringBuilder sb=new StringBuilder("GodIsGreat");
		int initialLength=sb.length();
		System.out.println("Length of the Initial String is :"+initialLength);
		
		StringBuilder replace=sb.replace(6,8,"XYZ");
		int finalLength=replace.length();
		System.out.println("Length After Replace :"+finalLength);
		System.out.println("String After Replace :"+replace);

		
		
		}


}