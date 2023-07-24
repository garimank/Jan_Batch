package PKG1;

public class This_Keyword {
	
	public This_Keyword() {
		this (33,89,12);
		System.out.println("defaul parameterised");
	}
	public This_Keyword(int a, int b, int c) {
	
		System.out.println("three parameterized");
	}
	public This_Keyword(int a, int b) {
		this (55,88,03,94);
		
		System.out.println("two parameterized");
		
	}
	public This_Keyword(int a,int b, int c, int d)
	{
		this(66);
		
		System.out.println("four parameterized");
	}
public This_Keyword(int a) {
	this(); 	
	System.out.println("one parameterized");
}
public static void main(String[] args) {
	This_Keyword obj1=new This_Keyword(26,38);
	
	
}
}
