import java.util.Scanner;
public class DevideByZeroHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("�������� �Է��Ͻÿ�:");
		dividend = sc.nextInt();
		System.out.print("�������� �Է��Ͻÿ�:");
		divisor = sc.nextInt();
		
		try {
			System.out.println(dividend +"�� " + divisor + "�� ������ ���� " + dividend/divisor+ "�Դϴ�.");
		}
		catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�!");
		}
		finally {
			sc.close();
		}

	}

}