import java.util.Scanner;

public class Twenties {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ���:");
		int age = sc.nextInt();
		if((age >= 20) && (age < 30)) {
			System.out.print("20���Դϴ�. ");
			System.out.println("20��� �ູ�մϴ�!");
		}
		else
			System.out.println("20�밡 �ƴմϴ�.");
		
		sc.close();

	}

}