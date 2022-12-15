# java
import java.util.Scanner;
public class Fact{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.println("Enter the number:");
int number=input.nextInt();
int fact=1;
for(int i=1;i<=number;i++){
	fact=fact*i;
}
System.out.println("the factorial of "+number+" is "+fact);
}
}
