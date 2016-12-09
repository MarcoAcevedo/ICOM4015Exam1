import java.lang.Math;

public class Complex {
	
	private double real;
	private double imaginary;
	private double absolute;
	
	//private double absolute;

	//Setter
	public void setReal(double real){
		this.real = real;
	}
	
	public void setImaginary(double imaginary){
		this.imaginary = imaginary;
	}
	
	
	//Getters
	public double getReal() {
		return real;
	}
	
	public double getImaginary() {
		return imaginary;
	}
	
	
	//Constructor
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	
	//absolute
	public double absolute() {//fail
		absolute = Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
		return absolute;  // Return 0 to avoid compiler error
	}
	
	
	public Complex add(Complex c2) {
		
		c2.setReal(this.real+c2.getReal());
		c2.setImaginary(this.imaginary+c2.getImaginary());
		return c2;
	}
	
	
	public Complex multiply(Complex c2) {//fail
		double temp = (c2.getReal()*this.real) - (c2.getImaginary()*this.imaginary) ;
		double tempy= ((c2.getImaginary()*this.real)+(c2.getReal()*this.imaginary));
		Complex Multiplied = new Complex(temp,tempy);
		return Multiplied; // Return null temporarily to avoid compiler error
	}
	
	
	public Complex reciprocal() {//error
		double tempReal = (this.real)/((Math.pow(this.real,2.0))+(Math.pow(this.imaginary,2.0)));
		double tempImaginary = (this.real)/(this.real)/((Math.pow(this.real,2.0))+(Math.pow(this.imaginary,2.0)));
		setReal(tempReal);
		setImaginary(tempImaginary);
		
		
		return null; // Return null reference to avoid compiler error
	}
}