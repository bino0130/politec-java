package another;

import java.util.ArrayList;
import java.util.Scanner;

public class A4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메뉴를 선택하세요.");
		showMenu();
		int choice = sc.nextInt();
		if (choice == 1) {
			encyrption();
		} else if (choice == 2) {
			decryption();
		} else {
			System.out.println("메뉴는 1번부터 2번까지입니다. 다시 선택해주세요.");
		}

	}

	public static void showMenu() {
		System.out.println("# Menu");
		System.out.println("1. Encryption");
		System.out.println("2. Decryption");
		System.out.print("-> ");
	}

	public static void encyrption() {
		System.out.println("암호화할 문자키를 입력해주세요.");
		String input = sc.next();
		String str = input;

		for (int i = 0; i < str.length(); i++) {
			byte b = 0;
			if (str.charAt(i) > 96 && str.charAt(i) < 123) {
				b += (byte) str.charAt(i) + 1;
				char c = (char) b;
				System.out.print(c);
			}
		}
	}

	public static void decryption() {
		System.out.println("복호화할 문자키를 입력해주세요.");
		String input = sc.next();
		String str = input;

		for (int i = 0; i < str.length(); i++) {
			byte b = 0;
			if (str.charAt(i) > 96 && str.charAt(i) < 123) {
				b += (byte) str.charAt(i) - 1;
				char c = (char) b;
				System.out.print(c);
			}
		}
	}
}