import java.util.Scanner;
public class Natural{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.println("Enter the number:");
int number=input.nextInt();
for(int i=1;i<=number;i++){
System.out.print(" "+i);
}
}
