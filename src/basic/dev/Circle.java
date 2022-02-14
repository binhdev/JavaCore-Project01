package basic.dev;

public class Circle extends Shape {
	
	private double banKinh;

	public Circle(double banKinh) {
		super();
		this.banKinh = banKinh;
	}

	@Override
	protected double chuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * this.banKinh;
	}

	@Override
	protected double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * this.banKinh * this.banKinh;
	}

}
