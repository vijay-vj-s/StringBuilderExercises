public class StringBuilderFour{
 public static void main(String[]args){
    StringBuilder sb=new StringBuilder("Mindset"+" "+"Matters");
	
	int initialLength=sb.length();
	int index=sb.indexOf(" ");
	System.out.println("Initial Length of the String is :"+initialLength);
	StringBuilder deleteFirst=sb.delete(0,index);
    int finalLength=deleteFirst.length();
    System.out.println("After Deleting the First String :"+deleteFirst);
    System.out.println("length After the Deletion :"+finalLength);
 
 
 
 
 
    }



}