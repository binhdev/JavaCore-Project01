package basic.dev;

public class Rectangle extends Shape {
	
	private double canhA;
	private double canhB;
	
	public Rectangle(double canhA, double canhB) {
		super();
		this.canhA = canhA;
		this.canhB = canhB;
	}

	@Override
	protected double chuVi() {
		// TODO Auto-generated method stub
		return 2 * (this.canhA + this.canhB);
	}

	@Override
	protected double dienTich() {
		// TODO Auto-generated method stub
		return this.canhA * this.canhB;
	}

}
