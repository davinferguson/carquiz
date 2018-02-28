public class BuyCar {

private double costOfCar;
private double interestRate;
private double downPayment;
private double numOfMonths;

public BuyCar(int para1, double para2, int para3, double d) {

	this.costOfCar = para1;
	interestRate = para2;
	this.downPayment = para3;
	numOfMonths = d;
}




public double monthlyPayment() {

	double monthInterestRate = interestRate/12;
	
	double carPaymentWithLoan = costOfCar - downPayment;
	
	double value1 = carPaymentWithLoan * monthInterestRate;
	
	double value2 = 1 + monthInterestRate;
	
	double value3 = 1-(1/(Math.pow(value2, numOfMonths)));
	
	double monthlyPayResult = value1/value3;
	
	return Math.round(monthlyPayResult*100.0)/100.0;


}

public String totalInterest() {
	double totalInterestResult = monthlyPayment()*numOfMonths-(costOfCar-downPayment);
	
	String StrInterestResult = String.format ("%.2f", totalInterestResult);
	
	return StrInterestResult;



}

public static void main(String[] args) {

	BuyCar myCar = new BuyCar(35000, 0.1, 0, 60);
	
		System.out.println(myCar.totalInterest());

}

}