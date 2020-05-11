import java.util.Vector;

class Point6 {
	private int x, y;
	public Point6(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class PointVectorEx {

	public static void main(String[] args) {
		Vector<Point6> v = new Vector<Point6>();
		
		v.add(new Point6(2, 3));
		v.add(new Point6(-5, 20));
		v.add(new Point6(30, -8));
		
		v.remove(1);
		
		for(int i = 0; i < v.size(); i++) {
			Point6 p = v.get(i);
			System.out.println(p.toString());
		}
	}

}
