
   public class StringBuilderOne{
	   public static void main(String[]args){
		
		   StringBuilder sb=new StringBuilder("");
		  int initialLength=sb.length();
		   System.out.println("Length of the Empty String is :" +initialLength);
		   
		   StringBuilder add=sb.append("xyz");
		   int finalLength=add.length();
		   System.out.println("After the append :"+add);
			System.out.println("Length  of the append String :" +finalLength);
		   
		   
		   
	   }
	   
	   
	 
   }