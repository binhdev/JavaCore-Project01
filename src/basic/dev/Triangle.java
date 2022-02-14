package basic.dev;

public class Triangle extends Shape {

	private double canhA;
	private double canhB;
	private double canhC;
	
	public Triangle(double canhA, double canhB, double canhC) {
		super();
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}

	@Override
	protected double chuVi() {
		// TODO Auto-generated method stub
		return this.canhA + this.canhB + this.canhC;
	}

	@Override
	protected double dienTich() {
		// TODO Auto-generated method stub
		double p = this.chuVi() / 2;
		return Math.sqrt(p * (p - this.canhA) * (p - this.canhB) * (p - this.canhC));
	}

}
