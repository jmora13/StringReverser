import java.util.Scanner;
public class StringReverser {
	public static String reverse(String original){
		if (original.length() == 0) 
	         return original;
	    return reverse(original.substring(1)) + original.charAt(0);
	      }
	     
	public static void main(String[] args){
		Scanner in = new Scanner(System.in); 
	      System.out.println("Enter a string to reverse");
	      String s = in.nextLine();
	      System.out.println(s);
	      System.out.println(reverse(s));
	}
}
