import java.util.*;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=input.nextLine();
		String temp="";
		int l=s.length();
		for(int i=l-1;i>=0;i--) {
			System.out.print(s.charAt(i));
			temp=temp+s.charAt(i);
		}
		System.out.println();
		if(s.equals(temp)) {
			System.out.println("Its palindrome");
		}
		else {
			System.out.println("Its  not palindrome");
		}
	}
