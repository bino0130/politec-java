package another; // 예금, 출금, 잔액 확인

import java.util.Scanner;

public class A2 {
	
	static int balance = 0;
	static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selectNum = 1;
		int money = 0;
		int balance = 0;
		
		while(true) {
			showMenu();
			int choiceNumber = sc.nextInt();
			
			if (choiceNumber == 1) {
				System.out.println("예금하실 금액은 얼마인가요?");
				money = sc.nextInt();
				balance += money;
				System.out.println("현재 잔액은 " + balance + "원 입니다.\n");
			} else if (choiceNumber == 2) {
				System.out.println("출금하실 금액은 얼마인가요?");
				money = sc.nextInt();
				balance -= money;
				System.out.println("현재 잔액은 " + balance + "원 입니다.\n");
			} else if (choiceNumber == 3) {
				System.out.print("종료합니다.");
				break;
			} else {
				System.out.println("메뉴는 1번부터 3번까지 입니다.\n");
			}
		}
	}

	public static void showMenu() {
		System.out.println("# Menu");
		System.out.println("1. 예금");
		System.out.println("2. 출금");
		System.out.println("3. 종료");
		System.out.println("메뉴를 선택하세요.");
	}
}
