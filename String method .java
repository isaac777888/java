class String_Method{
public static void main(String args[]){
String s1=new String("anudip");
System.out.println(s1.charAt(1));
String s2="hello";
String s3="world";
System.out.println(s2.compareTo(s3));
System.out.println(s2.compareToIgnoreCase(s3));
System.out.println(s2.concat(s3));
System.out.println(s2.contains("he"));
System.out.println(s2.startsWith("h"));
System.out.println(s2.endsWith("d"));
System.out.println(s3.substring(0,3));
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
}
}
