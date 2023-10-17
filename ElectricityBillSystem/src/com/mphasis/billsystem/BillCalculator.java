package com.mphasis.billsystem;

public class BillCalculator {

	public static void main(String[] args) {
		int units =250;
		double billtopay =0;
		if(units < 100)
		{
			billtopay = units * 1.20;
			
		}
		else if(units < 300)
		{
			billtopay = 100 * 1.20 + (units -100) * 2;
		}
		
		System.out.println("the electricity bill for " +units+ " is  " + billtopay);
	}
}
