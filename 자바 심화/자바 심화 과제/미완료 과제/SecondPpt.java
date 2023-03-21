package advanced;

import java.util.Scanner;

public class SecondPpt { // 클래스 선언

	public static void main(String[] args) {
		//////////////////////////////
		// CastingEx1
//		double k10_d = 85.4;
//		int k10_score = (int)k10_d;
//		
//		System.out.println("score = " + k10_score);
//		System.out.println("d = " + k10_d);
		//////////////////////////////
		
		//////////////////////////////
		// CastingEx2
//		int k10_i = 10; //int형 변수 i를 10으로 초기화
//		byte k10_b = (byte)k10_i; // i를 byte로 형변환한 뒤 b값에 대입
//		System.out.printf("[int -> byte] i = %d -> b = %d\n", k10_i, k10_b); // i,b 모두 10으로 출력
//		
//		k10_i = 300; //int형 변수 i를 300으로 변경
//		k10_b = (byte)k10_i; // i를 byte로 형변환한 뒤 b값에 대입
//		System.out.printf("[int -> byte] i = %d -> b = %d\n", k10_i, k10_b); // i는 300으로 출력되지만 b는 44가 출력된다.
//		// byte는 -128부터 127까지 표현할 수 있고, 그 이상의 값을 출력하면 원래 표현하고자 하는 값이 소실되므로 엉뚱한 값이 출력될 수 있음
//		
//		k10_b = 10; // b값을 10으로 변경
//		k10_i = (int)k10_b; // b값을 int로 형변환한 뒤 i에 대입
//		System.out.printf("[byte -> int] b = %d -> i = %d\n", k10_b, k10_i); // b와 i 모두 10으로 출력됨
//		
//		k10_b = -2; // b값을 10으로 변경
//		k10_i = (int)k10_b; // b값을 int로 형변환한 뒤 i에 대입
//		System.out.println("i = " + Integer.toBinaryString(k10_i)); // i = 11111111111111111111111111111110로 출력됨
//		// int는 32비트로 구성되고 2진수에서 제일 앞비트는 양수일때 0, 음수일때 1로 표현한다.
		//////////////////////////////

		//////////////////////////////
		// CastingEx3
//		float k10_f = 9.1234567f; // float 변수 f에 9,1254567f 초기화
//		double k10_d = 9.1234567; // double 변수 d에 9.1234567 초기화
//		double k10_d2 = (double) k10_f; // double 변수 d2에 float 변수 f를 double로 형변환해서 대입
//		
//		System.out.printf("f = %20.18f\n", k10_f); // 20자리 중 소수점 18번째 자리까지만 출력. 9.123456954956055000 출력
//		System.out.printf("d = %20.18f\n", k10_d); // 20자리 중 소수점 18번째 자리까지만 출력, 9.123456700000000000 출력
//		System.out.printf("d2 = %20.18f\n", k10_d2); // 20자리 중 소수점 18번째 자리까지만 출력. 9.123456954956055000 출력
		//////////////////////////////
		
		//////////////////////////////
		// CastingEx4
//		int k10_i = 91234567;	//8자리의 10진수
//		
//		float k10_f = (float)k10_i;	// int를 float로 형변환
//		int k10_i2 = (int)k10_f;		// float를 다시 int로 형변환
//		
//		double k10_d = (double)k10_i;
//		int k10_i3 = (int)k10_d;
//		
//		float k10_f2 = 1.666f;
//		int k10_i4 = (int)k10_f2;
//		
//		System.out.printf("i = %d\n", k10_i);
//		
//		System.out.printf("f = %f i2 = %d\n", k10_f, k10_i2);
//		
//		System.out.printf("d= %f i3 = %d\n", k10_d, k10_i3);
//		
//		System.out.printf("(int)%f = %d\n", k10_f2, k10_i4);
		//////////////////////////////
		
		//////////////////////////////
		// VarEx1
//		int k10_year = 0;
//		int k10_age = 14;
//		
//		System.out.println("결과1 :" + k10_year);
//		System.out.println("결과2 :" + k10_age);
//		
//		k10_year = k10_age + 2000;
//		k10_age = k10_age + 1;
//		
//		System.out.println("결과3 :" + k10_year);
//		System.out.println("결과4 :" + k10_age);
		//////////////////////////////
		
		//////////////////////////////
		// VarEx2
//		int k10_x = 10;
//		int k10_y = 20;
//		int k10_tmp = 0;
//		
//		System.out.println("x:" + k10_x + " y: " + k10_y);
//		
//		k10_tmp = k10_x;
//		k10_x = k10_y;
//		k10_y = k10_tmp;
//		
//		System.out.println("x:" + k10_x + " y:" + k10_y);
		//////////////////////////////
		
		//////////////////////////////
		// StringEx
//		String k10_name = "Ja" + "va";
//		String k10_str = k10_name + 8.0;
//		
//		System.out.println(k10_name);
//		
//		System.out.println(k10_str);
//		
//		System.out.println(7 + " ");
//		
//		System.out.println(" " + 7);
//		
//		System.out.println(7 + "");
//		
//		System.out.println("" + 7);
//		
//		System.out.println("" + "");
//		
//		System.out.println(7 + 7 + "");
//		
//		System.out.println("" + 7 + 7);
		//////////////////////////////
		
		//////////////////////////////
		// SpecialCharEx
//		System.out.println('\'');
//		System.out.println("abc\t123\b456");
//		System.out.println('\n');
//		System.out.println("\"Hello\"");
//		System.out.println("c:\\");
		//////////////////////////////
		
		//////////////////////////////
		// ScannerEx
//		Scanner k10_sc = new Scanner(System.in);
//		
//		System.out.println("두 자리 점수를 하나 입력해주세요. ->");
//		
//		String k10_input = k10_sc.nextLine();
//		int k10_num = Integer.parseInt(k10_input);
//		
//		System.out.println("입력내용 :" + k10_input);
//		System.out.printf("num = %d%n", k10_num);
		//////////////////////////////
		
		//////////////////////////////
		// PrintEx1
//		byte k10_b = 1;
//		short k10_s = 2;
//		char k10_c = 'A';
//		
//		int k10_finger = 10;
//		long k10_big = 10000000000000L;
//		long k10_hex = 0xFFFFFFFFFFFFFFFFL;
//		
//		int k10_octNum = 010;
//		int k10_hexNum = 0x10;
//		int k10_binNum = 0b10;
//		
//		System.out.printf("b = %d%n", k10_b);
//		
//		System.out.printf("s = %d%n", k10_s);
//		
//		System.out.printf("c = %c, %d %n", k10_c, (int)k10_c);
//		
//		System.out.printf("finger = [%5d]\n", k10_finger);
//		
//		System.out.printf("finger = [%-5d]\n", k10_finger);
//		
//		System.out.printf("finger = [%05d]\n", k10_finger);
//		
//		System.out.printf("big = %d\n", k10_big);
//		
//		System.out.printf("hex = %#x\n", k10_hex);
//		
//		System.out.printf("octNum = %o, %d%n", k10_octNum, k10_octNum);
//		
//		System.out.printf("hexNum = %x, %d\n", k10_hexNum, k10_hexNum);
//		
//		System.out.printf("binNum = %s, %d\n", Integer.toBinaryString(k10_binNum), k10_binNum);
		//////////////////////////////
		
		//////////////////////////////
		// PrintEx2
//		String k10_url = "www.codechobo.com";
//		
//		float k10_f1 = .10f;
//		float k10_f2 = 1e1f;
//		float k10_f3 = 3.14e3f;
//		double k10_d = 1.23456789;
//		
//		System.out.printf("f1 = %f, %e, %g\n", k10_f1, k10_f1, k10_f1);
//		System.out.printf("f2 = %f, %e, %g\n", k10_f2, k10_f2, k10_f2);
//		System.out.printf("f3 = %f, %e, %g\n", k10_f3, k10_f3, k10_f3);
//		
//		System.out.printf("d = %f\n", k10_d);
//		System.out.printf("d = %14.10f\n", k10_d);
//		
//		System.out.printf("[12345678901234567890] \n");
//		System.out.printf("[%s]\n",k10_url);
//		System.out.printf("[%20s]\n",k10_url);
//		System.out.printf("[%-20s]\n",k10_url);
//		System.out.printf("[%.8s]\n",k10_url);
		//////////////////////////////
		
		//////////////////////////////
		// OverflowEx
//		short k10_sMin = -32768;
//		short k10_sMax = 32767;
//		char k10_cMin = 0;
//		char k10_cMax = 65535;
//		
//		System.out.println("sMin		= " + k10_sMin);
//		
//		System.out.println("sMin - 1	= " + (short)(k10_sMin - 1));
//		
//		System.out.println("sMax		= " + k10_sMax);
//		
//		System.out.println("sMax + 1	= " + (short)(k10_sMax + 1));
//		
//		System.out.println("cMin		= " + (int)(k10_cMin));
//		
//		System.out.println("cMin - 1	= " + (int)(--k10_cMin));
//		
//		System.out.println("cMax		= " + (int)(k10_cMax));
//		
//		System.out.println("cMax + 1	= " + (int)(++k10_cMax));
		//////////////////////////////
	}

}