import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 : ");
		int age = scanner.nextInt();
		
//		키보드 버퍼를 비운다.
		scanner.nextLine();
		
		System.out.println("이름을 입력하세요 : ");
		String name = scanner.nextLine();
		
		System.out.println(name + "님은 " + age + "살 입니다.");
		System.out.println(name + "님은 내년에 " + (age+1) + "살 입니다.");
	}
}
