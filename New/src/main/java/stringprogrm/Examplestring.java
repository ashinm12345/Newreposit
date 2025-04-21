package stringprogrm;

public class Examplestring {

	public static void main(String[] args) {
		//literal 
		String s1="Hello";
		//new keyword
		String s2=new String("hi");
		
		System.out.println(s1);
		System.out.println(s2);
		//convert charater in to string
		char h[]= {'A','B','C'};
		String s3=new String (h);
		System.out.println(s3);
		//length
		System.out.println(s1.length());
		//concat()
		System.out.println(s1.concat(s3));
		//touppercase
		System.out.println(s1.toUpperCase());
		//lowercase
		System.out.println(s3.toLowerCase());
		//equal
		String s4="java";
		String s5="java";
		String s6="Java";
		String s7="selenium";
		System.out.println(s4.equals(s5));
		System.out.println(s5.equals(s6));
		System.out.println(s6.equals(s7));
		// equalgnorecase()
		System.out.println(s4.equalsIgnoreCase(s6));
		//valueof
		int a=10;
		String h1 ="";
		String s9=h1.valueOf(a);
		System.out.println(s9);
		//is empty
		String s8="";
		System.out.println(s8.isEmpty());
		System.out.println(s5.isEmpty());
		
		// TODO Auto-generated method stub

	}

}
