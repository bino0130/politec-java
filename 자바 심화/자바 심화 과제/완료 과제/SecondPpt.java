package advanced;

import java.util.Scanner;

public class SecondPpt { // 클래스 선언

	public static void main(String[] args) {
		//////////////////////////////
		// CastingEx1
//		double k10_d = 85.4; // double형 변수 d를 85.4로 초기화
//		int k10_score = (int)k10_d; // d를 int형으로 형변환해서 score를 85로 초기화
//		
//		System.out.println("score = " + k10_score); // 85 출력
//		System.out.println("d = " + k10_d); // 85.4 출력
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
//		double k10_d = (double)k10_i; // int를 double로 형변환
//		int k10_i3 = (int)k10_d; // double을 다시 int로 형변환
//		
//		float k10_f2 = 1.666f; // float형 변수 f2 1.666f로 초기화
//		int k10_i4 = (int)k10_f2; // float를 int로 형변환
//		
//		System.out.printf("i = %d\n", k10_i); // 91234567 출력
//		
//		System.out.printf("f = %f i2 = %d\n", k10_f, k10_i2); // f = 91234568.000000, i2 = 91234568 출력
//		// 처음 i가 출력되었을때는 91234567이었는데 i를 float 타입으로 형변환했더니 1의자리가 1 증가하였다
//		
//		System.out.printf("d= %f i3 = %d\n", k10_d, k10_i3);
//		// 91234568.000000을 int로 형변환했더니 값이 다시 91234567로 변경되었다
//		
//		System.out.printf("(int)%f = %d\n", k10_f2, k10_i4); // (int)1.666000 = 1 출력
		//////////////////////////////
		
		//////////////////////////////
		// VarEx1
//		int k10_year = 0; // year라는 숫자형 변수를 0으로 초기화
//		int k10_age = 14; // age라는 숫자형 변수를 14로 초기화
//		
//		System.out.println("결과1 :" + k10_year); // year 0으로 출력
//		System.out.println("결과2 :" + k10_age); // age 14로 출력
//		
//		k10_year = k10_age + 2000; // 변수 age에 2000을 더해서 year에 저장
//		k10_age = k10_age + 1; // 변수 age에 저장된 값을 1 증가시킨다
//		
//		System.out.println("결과3 :" + k10_year); // year 2014로 출력
//		System.out.println("결과4 :" + k10_age); // age 15로 출력
		//////////////////////////////
		
		//////////////////////////////
		// VarEx2
//		int k10_x = 10; // 변수 x를 선언한 뒤 10으로 초기화
//		int k10_y = 20; // 변수 y를 선언한 뒤 20으로 초기화
//		int k10_tmp = 0; // 변수 tmp를 선언한 뒤 0으로 초기화
//		
//		System.out.println("x:" + k10_x + " y: " + k10_y); // x는 10, y는 20 출력
//		
//		k10_tmp = k10_x; // tmp값 10으로 변경
//		k10_x = k10_y; // x값 20으로 변경
//		k10_y = k10_tmp; // y값 0으로 변경
//		
//		System.out.println("x:" + k10_x + " y:" + k10_y); //x는 20, y는 10 출력
		//////////////////////////////
		
		//////////////////////////////
		// StringEx
//		String k10_name = "Ja" + "va"; // 문자형 변수 name Java로 초기화
//		String k10_str = k10_name + 8.0; // 변수 name에 8.0을 더해준다
//		
//		System.out.println(k10_name); // 변수 name Java로 출력됨
//		
//		System.out.println(k10_str); // 변수 str Java8.0으로 출력됨
//		
//		System.out.println(7 + " "); // 7로 출력됨
//		
//		System.out.println(" " + 7); //  7로 출력됨 (첫 시작에서 space 한칸 띄우고 7 출력)
//		
//		System.out.println(7 + ""); // 7 출력
//		
//		System.out.println("" + 7); // 7 출력 (공백이 없기때문에 위와 똑같이 출력)
//		
//		System.out.println("" + ""); // 아무것도 출력되지 않음
//		
//		System.out.println(7 + 7 + ""); // 14 출력
//		
//		System.out.println("" + 7 + 7); // 77 출력 ( 문자형이 먼저 오고 난 뒤 숫자가 오면 문자형으로 취급하고 계산)
		//////////////////////////////
		
		//////////////////////////////
		// SpecialCharEx
//		System.out.println('\'');				// '출력 (\는 '이므로 ' '안에 '가 있는것으로 해석해서 이렇게 출력됨)
//		System.out.println("abc\t123\b456");	// 원래대로라면 \b에 의해 3이 지워져야 하지만 이클립스 콘솔 오류로 깨진 문자가 출력됨
//		System.out.println('\n');				// 개행
//		System.out.println("\"Hello\"");		// 큰따옴표를 출력하려면 이렇게 출력하면 된다
//		System.out.println("c:\\");				// c:\ 출력 (큰 따옴표 안에 역슬래쉬를 표현하고 싶으면 \\ 사용)
		//////////////////////////////
		
		//////////////////////////////
		// ScannerEx
//		Scanner k10_sc = new Scanner(System.in); // new를 사용해 스캐너 선언
//		
//		System.out.println("두 자리 점수를 하나 입력해주세요. ->"); // 두자리 점수를 하나 입력해주세요.
//		
//		String k10_input = k10_sc.nextLine(); // 스캐너 입력
//		int k10_num = Integer.parseInt(k10_input); // 입력받은 문자열을 정수형으로 변환해주는 pareint 사용
//		
//		System.out.println("입력내용 :" + k10_input); // 입력내용 :60 출력
//		System.out.printf("num = %d%n", k10_num); // k10_num = 60 출력 (%n은 \n과 같은 의미로 사용되지만, 통상적으로 \n을 더 많이 사용
		//////////////////////////////
		
		//////////////////////////////
		// PrintEx1
//		byte k10_b = 1; // byte 타입 변수 b 1로 초기화
//		short k10_s = 2; // short 타입 변수 s 2로 초기화
//		char k10_c = 'A'; // char 타입 변수 c A로 초기화
//		
//		int k10_finger = 10; // int 타입 변수 finger 10으로 초기화
//		long k10_big = 10000000000000L; // long 타입 변수 big 10000000000000L로 초기화 
//		long k10_hex = 0xFFFFFFFFFFFFFFFFL; // long 타입 변수 hex 0xFFFFFFFFFFFFFFFFL로 초기화
//		
//		int k10_octNum = 010; // 8진수 10, 10진수로는 8
//		int k10_hexNum = 0x10; // 16진수 10, 10진수로는 16
//		int k10_binNum = 0b10; // 2진수 10, 10진수로는 2
//		
//		System.out.printf("b = %d%n", k10_b); // %d는 10진수를 출력. 1출력
//		
//		System.out.printf("s = %d%n", k10_s); // %d는 10진수를 출력, 2 출력
//		
//		System.out.printf("c = %c, %d %n", k10_c, (int)k10_c); // %c는 int값을 문자로 출력, A / 65 출력
//		
//		System.out.printf("finger = [%5d]\n", k10_finger); // [   10] 출력 (전체 폭이 5이고 양수이므로 우측정렬)
//		
//		System.out.printf("finger = [%-5d]\n", k10_finger); // [10   ] 출력 (전체 폭이 5이고 음수이므로 좌측정렬)
//		
//		System.out.printf("finger = [%05d]\n", k10_finger); // [00010] 출력 (전체 폭은 5이고 우측정렬로 출력한 뒤 빈 부분은 0으로 채움)
//		
//		System.out.printf("big = %d\n", k10_big); // 10000000000000 출력
//		
//		System.out.printf("hex = %#x\n", k10_hex); // 0xffffffffffffffff 출력
//		
//		System.out.printf("octNum = %o, %d%n", k10_octNum, k10_octNum); // 8진수 10, 10진수 8 출력 (%o는 8진수)
//		
//		System.out.printf("hexNum = %x, %d\n", k10_hexNum, k10_hexNum); // 16진수 10, 10진수 16 출력 (%x는 16진수)
//		
//		// 10진수를 2진수 문자열로 변환할 때 Integer.toBinaryString() 사용
//		System.out.printf("binNum = %s, %d\n", Integer.toBinaryString(k10_binNum), k10_binNum); // 2진수 10, 10진수 2 출력
		//////////////////////////////
		
		//////////////////////////////
		// PrintEx2
//		String k10_url = "www.codechobo.com";
//		
//		float k10_f1 = .10f; // 0.10, 1.0e-1
//		float k10_f2 = 1e1f; // 10.0, 1.0e1, 1.0e + 1
//		float k10_f3 = 3.14e3f; // f3는 3.14e3f로 초기화
//		double k10_d = 1.23456789; // d는 1.23456789로 초기화
//		
//		// %e는 지수 표현식의 형식으로 출력, %g는 간략한 지수 표현식 형식으로 출력
//		System.out.printf("f1 = %f, %e, %g\n", k10_f1, k10_f1, k10_f1); // f1 = 0.100000, 1.000000e-01, 0.100000 출력
//		System.out.printf("f2 = %f, %e, %g\n", k10_f2, k10_f2, k10_f2); // f2 = 10.000000, 1.000000e+01, 10.0000 출력
//		System.out.printf("f3 = %f, %e, %g\n", k10_f3, k10_f3, k10_f3); // f3 = 3140.000000, 3.140000e+03, 3140.00 출력
//		
//		System.out.printf("d = %f\n", k10_d); // 1.2374568 출력, 소수점 7의자리에서 반올림한걸 알 수 있음
//		System.out.printf("d = %14.10f\n", k10_d); // 1.2345678900 출력
//		
//		System.out.printf("[12345678901234567890] \n"); // [12345678901234567890] 출력
//		System.out.printf("[%s]\n",k10_url); // [www.codechobo.com] 출력
//		System.out.printf("[%20s]\n",k10_url); // [   www.codechobo.com] 출력, 폭이 20이고 우측 정렬
//		System.out.printf("[%-20s]\n",k10_url); // [www.codechobo.com   ] 출력, 폭이 20이고 좌측 정렬
//		System.out.printf("[%.8s\n",k10_url); // [www.code 출력, 왼쪽부터 8자리씩 출력
		//////////////////////////////
		
		//////////////////////////////
		// OverflowEx
//		short k10_sMin = -32768; // sMin에 short의 데이터 표현 범위 선언
//		short k10_sMax = 32767; // sMax에 SHORT의 데이터 표현 범위 선언
//		char k10_cMin = 0; // cMin에 char의 데이터 표현 범위 선언
//		char k10_cMax = 65535; // cMax에 char의 데이터 표현 범위 선언
//		
//		System.out.println("sMin		= " + k10_sMin); // -32768 출력
//		
//		System.out.println("sMin - 1	= " + (short)(k10_sMin - 1)); // 최소값에 -1을 했더니 최댓값인 32767이 출력된다
//		
//		System.out.println("sMax		= " + k10_sMax); // 32767 출력
//		
//		System.out.println("sMax + 1	= " + (short)(k10_sMax + 1)); // 최대값에 +1을 했더니 -32768이 출력된다
//		
//		System.out.println("cMin		= " + (int)(k10_cMin)); // 0 출력
//		
//		System.out.println("cMin - 1	= " + (int)(--k10_cMin)); // 최소값에서 -1을 했더니 65535가 출력된다
//		
//		System.out.println("cMax		= " + (int)(k10_cMax)); // 65535 출력
//		
//		System.out.println("cMax + 1	= " + (int)(++k10_cMax)); // 최대값 65535에서 +1을 했더니 최소값인 0이 출력된다
		//////////////////////////////
	}

}