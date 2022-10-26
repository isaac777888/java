import java.util.Scanner;
public class Palindrome{
static void m(int n){
	int rem,sum=0;
	int temp=n;
	while(n>0){
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
	}
	if(temp==sum){
		System.out.println(sum+"Its Palindrome number");
	}
	else{
		System.out.println(sum+"Its not a Palindrome number");
	}
}

public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the number:");
int number=input.nextInt();
m(number);
}
}
