package basic.dev;
/**
 * 
 * @author tranthanhbinh
 * Viet chuong trinh nhap vao mot mang 5 hinh (chu nhat, tron, tam giac)
 * a) Tinh chu vi, dien tich cac hinh
 * b) Tim hinh co chu vi lon nhat, hinh co dien tich lon nhat
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shapes[] = new Shape[5];
		
		//Nhap vao 2 hinh tron
		Circle circle = new Circle(10);
		shapes[0] = circle;
		
		Circle circle2 = new Circle(20);
		shapes[1] = circle;
		
		//Nhap vao 2 hinh chu nhat
		Rectangle rect1 = new Rectangle(5, 15);
		shapes[2] = rect1;

		Rectangle rect2 = new Rectangle(10, 15);
		shapes[3] = rect2;
		
		//Nhap vao 1 tam giac
		Triangle tr = new Triangle(6, 12, 18);
		shapes[4] = tr;
		
		//In thong tin cac hinh
		for (int i = 0; i < shapes.length; i++) {
			System.out.format("Chu vi: %.2f", shapes[i].chuVi()).println();
			
			System.out.format("Dien tich: %.2f", shapes[i].dienTich()).println();
			System.out.println("************");
		}
		
		//Tim hinh co chu vi lon nhat, dien tich lon nhat
		Shape maxChuvi = shapes[0];
		Shape maxDientich = shapes[0];
		for (int i = 0; i < shapes.length; i++) {
			if(maxChuvi.chuVi() < shapes[i].chuVi()) {
				maxChuvi = shapes[i];
			}
			
			if(maxDientich.dienTich() < shapes[i].dienTich()) {
				maxDientich = shapes[i];
			}
		}
		
		System.out.println("Hinh co dien tich lon nhat");
		System.out.format("Dien tich: %.2f", maxDientich.dienTich()).println();
		
		System.out.println("Hinh co chu vi lon nhat");
		System.out.format("Chu vi: %.2f", maxChuvi.chuVi()).println();;
	}

}
