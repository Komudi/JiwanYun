class Point3 {
	int x, y;
	public Point3 (int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ObjectPropertyEx {

	public static void main(String[] args) {
		Point3 p = new Point3(2, 3);
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
	}
}