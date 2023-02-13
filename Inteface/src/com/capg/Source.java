package com.capg;

public abstract class Source

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICalculator obj=new StandardCalc();
		obj.addition();
		ICalculator calc= ()->System.out.println(5+7);
		calc.addition();
		
		

	}

}
