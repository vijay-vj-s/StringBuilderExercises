public class StringBuilderFive{
		public static void main(String[]args){
			
            StringBuilder sb=new StringBuilder("All"+" "+"IS"+" "+"WELL");
			int initialLength=sb.length();
			System.out.println("The Initial Length of the String is :"+initialLength);
			StringBuilder s=sb.replace(3,4,"-");
			StringBuilder s1=s.replace(6,7,"-");
			int finalLength=s1.length();
			
            System.out.println("Length after Replace :"+finalLength);			
		    System.out.println("String After Replace :" +s1);
		
		}



}