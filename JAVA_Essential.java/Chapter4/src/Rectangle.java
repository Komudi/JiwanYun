
public class Rectangle {

	int width;
	int height;
	int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		rect.width = 4;
		rect.height = 5;
		System.out.println("�簢���� ������ " + rect.getArea());
	}

}