import java.util.Scanner;
public class StringBuilderFour{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
		String string=sc.nextLine();
		StringBuilder sb=new StringBuilder(string);
		int space=sb.indexOf(" ");
		StringBuilder deleteFirst=sb.delete(0,space);
		System.out.println(deleteFirst);
		
		
		
		
	}
	
	
	
	
}