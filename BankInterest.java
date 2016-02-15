package session5;

public class BankInterest {
	
	private double defaultInterestRate = 0.0;

	//Constructor
	BankInterest() {}
	
	public double getRateOfInterest() {
		return defaultInterestRate;
	}
	
	//Setters
	public void setSBIRateOfInterest(double rate) {
		this.defaultInterestRate = rate;
	}
	
	public void setICICIRateOfInterest(double rate) {
		this.defaultInterestRate = rate;
	}

	public void setAxisRateOfInterest(double rate) {
		this.defaultInterestRate = rate;
	}
	
	public static void main(String[] args) {
		final double SBIRate = 8;
		final double ICICIRate = 7;
		final double AxisRate = 9;
		
		BankInterest bi = new BankInterest();
		
		System.out.println("Prior to overriding rates, default rate is " + bi.getRateOfInterest() + "%\n");
		
		bi.setSBIRateOfInterest(SBIRate);		
		System.out.println("After overriding the rates, SBI rate is " + bi.getRateOfInterest() + "%");
		
		bi.setICICIRateOfInterest(ICICIRate);
		System.out.println("After overriding the rates, ICICI rate is " + bi.getRateOfInterest() + "%");
		
		bi.setAxisRateOfInterest(AxisRate);
		System.out.println("After overriding the rates, Axis rate is " + bi.getRateOfInterest() + "%");
	}

}
