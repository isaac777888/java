# java
package javaPrograms;
interface Test{
	int m(int a,int b);
}

public class Lambda {
 public static void main(String[] args) {
	Test t=(a,b)->{
		return a+b;
	};System.out.println(t.m(50,45));
}
}
