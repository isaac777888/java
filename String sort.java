import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		String[] s= {"PRAVIN","SATHISH","NANDHA"};
		System.out.println("Before sorting: "+Arrays.toString(s));
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].compareTo(s[j])>0) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.print("After sorting: "+Arrays.toString(s));
	}

}
