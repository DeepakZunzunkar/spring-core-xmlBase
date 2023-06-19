package com.dz.app.constructorBase;

public class Calculate {

	private int a;
	private int b;
	
	public Calculate(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("constructor : double, double");
	}
	
	public Calculate(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("constructor : int, int ");
	}
	
	public Calculate(int...a) {
		super();
		System.out.println("constructor : var arg..");
		System.out.println(a);
	}
	
	/*public Calculate(int a, double b) {
		super();
		this.a = a;
		this.b =(int)b ;
		System.out.println("constructor : int, double ");
	}*/
	
	/*public Calculate(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("constructor : String, String ");
	}*/
	
	public void add() {
		System.out.println("addition of a= "+this.a+ " , b= "+this.b);
		System.out.println(a+b);
	}
}
