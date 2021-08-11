import java.util.Scanner;
public class StringBuilderSeven{

	public static void main(String[]args){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the length of the String :");
	 try{
	 int length=sc.nextInt();
	 sc.nextLine();
	 
	if(length>9){
		System.out.println("Enter the String :");
	 String string=sc.nextLine();
	StringBuilder sb=new StringBuilder(string);
	
	int initialLength=sb.length();
	System.out.println("Length of the String is :"+initialLength);
	StringBuilder delete=sb.delete(6,8);
	int finalLength=delete.length();
	
	System.out.println("Length After Deletion :"+delete);
	System.out.println("String After Deletion :"+finalLength);
	
	}
	else{
		
		System.out.println(" WARNING...!  Character length must be above 9");
	}
	 }
	 catch(Exception e)
	 {
		 System.out.println("Enter valid input:" );
	 }
	}



}