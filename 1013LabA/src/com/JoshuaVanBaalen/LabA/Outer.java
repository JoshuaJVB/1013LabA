package com.JoshuaVanBaalen.LabA;

public class Outer {
	
	double income;
	
	public Outer(double in) {
		this.income = in;
	}
	
	public double getTaxes() {
		Inner tax = new Inner();
		
		return tax.taxAmmount(income);
	}
	
	private class Inner{
		
		double stateTax = 0.123;
		double federalTax;

		double taxAmmount(double in) {
			
			//first we set federal tax rate
			if(in < 9700) {
				federalTax = 0;
			}else if(in < 39475) {
				federalTax = 0.12;
			}else if(in < 84200) {
				federalTax = 0.22;
			}else if( in < 160725) {
				federalTax = 0.24;
			}else if(in < 204200) {
				federalTax = 0.32;
			}else if(in < 520300) {
				federalTax = 0.35;
			}else {
				federalTax = 0.37;
			}
			
			return (in * stateTax) + (in * federalTax);
		}
	
	}

}
