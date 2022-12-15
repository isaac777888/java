# java
import java.util.Scanner;
public class Reverse{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.println("enter the number:");
int number=input.nextInt();
int rem,sum=0;
while(number>0){
	rem=number%10;
	sum=(sum*10)+rem;
	number=number/10;
}
System.out.println(sum);
}
}
