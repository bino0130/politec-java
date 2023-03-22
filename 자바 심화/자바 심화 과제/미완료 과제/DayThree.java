package advanced;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DayThree {

	public static void main(String[] args) {
		//////////////////////////////
		// #1. sin 함수 그래프
//		double k10_fSin; // double형 변수 k10_fSin
//		
//		for(int k10_i = 0; k10_i < 361; k10_i++) { // sin함수를 0도부터 360도까지 출력하는 반복문 실행
//			
//			k10_fSin = Math.sin(k10_i * Math.PI / 180); // Sin함수 값 계산하는 변수 fSin 초기화
//			
//			System.out.printf("Sin %d도 -> %f\n", k10_i , k10_fSin); // Sin %d 도 -> 0.000000 출력 
//			
//		}
//		
//		for (int k10_i = 0; k10_i < 361; k10_i++) { // i가 0부터 360일때까지 작동하는 반복문 실행  
//			k10_fSin = Math.sin(k10_i * Math.PI / 180); // Sin함수 값 계산하는 변수
//			
//			int iSpace = (int)((1.0 - k10_fSin) * 50); // 변수 iSpace 초기화
//			for (int k10_j = 0; k10_j < iSpace; k10_j++) System.out.print(" "); // j가 0부터 iSpace - 1일때까지 공백을 출력하는 반복문 실행
//			System.out.printf("*[%f][%d]\n", k10_fSin, iSpace); // 위 반복문 종료 후 fSin 값과 iSpace 값 출력
//		}
		//////////////////////////////

		//////////////////////////////
		// #2. 피라미드 찍기
//		int k10_n, k10_m; // int형 변수 n,m 선언
//		
//		k10_m = 20; k10_n = 1; // 변수 m에는 20, n에는 1 초기화 
//		
//		while (true) { // 무한루프문 실행
//			
//			// i가 0부터 m - 1일때까지 1씩 증가하면서 공백을 출력하는 반복문 실행
//			for (int k10_i = 0; k10_i < k10_m; k10_i++) System.out.print(" ");
//
//			// i가 0부터 n - 1일때까지 1씩 증가하면서 *을 출력하는 반복문 실행
//			for (int k10_i = 0; k10_i < k10_n; k10_i++) System.out.print("*");
//			
//			System.out.println(); // 개행
//			
//			k10_m = k10_m - 1; // 개행을 한 뒤 m - 1 (m은 1씩 감소함) Ex. 20, 19, 18, 17, 16, ...
//			k10_n = k10_n + 2; // 개행을 한 뒤 n + 2 (n은 2씩 증가함) Ex. 1, 3, 5, 7, 9, 11, ...
//			
//			if (k10_m < 0) break; // m이 0보다 작다면 break
//		}
		//////////////////////////////

		//////////////////////////////
		// #3. 칸 맞추기 실습
//		String k10_item = "사과"; // String 변수 item "사과"로 초기화
//		int k10_unit_item = 5000; // int형 변수 unit_item 5000으로 초기화
//		int k10_total = 0; // int형 변수 total 0으로 초기화
//		
//		DecimalFormat df = new DecimalFormat("###,###,###,###,###"); // 점찍기 하기위해 DecimalForamt 선언
//		
//		// 헤더 찍기
//		System.out.println("============================================"); // ==========출력
//		System.out.printf("%20.20s", "품목"); // 품목 출력
		//////////////////////////////

		//////////////////////////////
		// #4. 구구단 인쇄 (1)
//		for (int k10_i = 1; k10_i < 10; k10_i = k10_i + 3) { // i가 1부터 10 미만까지 3씩 증가하며 작동하는 반복문 실행
//			System.out.printf("***************\t***************\t***************\n"); // *출력
//			System.out.printf(" 구구단 %d 단  \t 구구단 %d 단  \t 구구단 %d 단 \t\n", k10_i, k10_i + 1, k10_i + 2); // 구구단 출력
//			System.out.printf("***************\t***************\t***************\n"); // *출력
//			for (int k10_j = 1; k10_j < 10; k10_j++) { // j가 1부터 9까지 1씩 증가하며 작동하는 반복문 실행
//				System.out.printf("%3d * %d = %2d\t", k10_i, k10_j, k10_j * k10_i); // 줄맞춤 하기위해 앞에있는 %d를 3d로 변경, 1/4/7단 출력
//				System.out.printf("%3d * %d = %2d\t", k10_i + 1, k10_j , k10_j * (k10_i + 1)); // 2/5/8단 출력
//				System.out.printf("%3d * %d = %2d\t\n", k10_i + 2, k10_j, k10_j * (k10_i + 2)); // 3/6/9단 출력, 개행
//			}
//		}
		//////////////////////////////

		//////////////////////////////
		// #5. 구구단 인쇄 (2)
//		for (int k10_i = 1; k10_i < 4; k10_i = k10_i + 1) { // i가 1부터 3까지 1씩 증가하며 작동하는 반복문 실행
//			System.out.printf("***************\t***************\t***************\n"); // *찍기
//			System.out.printf("  구구단 %d 단  \t 구구단 %d 단  \t 구구단 %d 단 \t\n", k10_i, k10_i + 3, k10_i + 6); // 구구단 i, i + 3, i + 6단 출력
//			System.out.printf("***************\t***************\t***************\n"); // *찍기
//			for(int k10_j = 1; k10_j < 10; k10_j++) { // j가 1부터 9까지 1씩 증가하며 작동하는 반복문 실행
//				System.out.printf("%3d * %d = %2d\t", k10_j, k10_i, k10_j * k10_i); // 줄맞춤 하기위해 앞에있는 %d를 3d로 변경, 1/2/3단 출력
//				System.out.printf("%3d * %d = %2d\t", k10_j, k10_i + 3, k10_j * (k10_i + 3)); // 4/5/6단 출력
//				System.out.printf("%3d * %d = %2d\t\n", k10_j, k10_i + 6, k10_j * (k10_i + 6)); // 7/8/9단 출력, 개행
//			}
//		}
		//////////////////////////////

		//////////////////////////////
		// #6. 달력 인쇄
//		int k10_iWeekday = 5; // 요일에따라 값이 달라지는 변수 iWeekday 5로 초기화
//		// 각 달마다 마지막 날을 넣은 배열 iEnd 초기화
//		int[] k10_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//
//		for (int k10_iMon = 0; k10_iMon < 12; k10_iMon++) { // iMon이 0부터 11까지 1씩 증가하며 작동하는 반복문 실행
//			System.out.printf("\n\n        %2d월\n", k10_iMon + 1); // 월 출력
//			System.out.printf("=====================\n"); // ================= 출력
//			System.out.printf(" 일 월 화 수 목 금 토\n"); // 요일 출력
//			for (int k10_j = 1; k10_j <= k10_iWeekday; k10_j++) { // Weekday의 카운트에 따라 공백을 출력하는 for문
//				System.out.printf("%3s", " "); // 공백 출력
//			}
//			
//			// iMon이 x일때, iEnd의 iEnd[x]번째에 있는 숫자 y가 있다고 치면
//			// i가 1부터 y까지 1씩 증가하며 작동하는 반복문 실행 
//			for (int k10_i = 1; k10_i <= k10_iEnd[k10_iMon]; k10_i++) {
//				System.out.printf("%3d", k10_i); // 요일 출력
//				k10_iWeekday++; // iWeekday 1씩 증가
//				if (k10_iWeekday % 7 == 0) { // iWeekday가 7이라면 
//					System.out.println(); // 개행
//					k10_iWeekday = 0; // 개행 후 iWeekday 0으로 초기화
//				}
//			}
//		}
		//////////////////////////////

		//////////////////////////////
		// #7. 영수증 출력 (1)
		// 거래일시는 calendar함수 getTime()으로 출력하면 된다
		// 콤마 찍기도 해주기
		// 세전가격 구하기 : 세후가격 / 11 * 10
//		DecimalFormat df = new DecimalFormat("###,###,###,###,###");
//		Calendar calt = Calendar.getInstance();
//		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
//		
//		int k10_iPrice = 33000;
//		int k10_beforePrice = k10_iPrice * 10 / 11; 
//		int k10_tax =  (int) (k10_beforePrice * 0.1);
//		System.out.printf("신용승인\n\n");
//		System.out.printf("단말기 : %8s%2s%s : %s\n", "2N68665898", " " ,"전표번호", "041218"); //36
//		System.out.printf("가맹점 : %s\n", "한양김치찌개");
//		System.out.printf("주  소 : %s\n", "경기 성남시 분당구 황새울로 351번길 10, 1층");
//		System.out.printf("대표자 : %s\n", "유창선");
//		System.out.printf("사업자 : %s%4s", "752-53-00558", " ");
//		System.out.printf("%3s : %s\n","TEL", "7055695"); //36
//		System.out.printf("--------------------------------------\n");
//		System.out.printf("금  액%24s%s원\n", " ", df.format(k10_iPrice - k10_tax));
//		System.out.printf("부가세%25s%s원\n", " ", df.format(k10_tax));
//		System.out.printf("합  계%24s%s원\n", " ", df.format(k10_iPrice));
//		System.out.printf("--------------------------------------\n");
//		System.out.printf("우리카드\n");
//		System.out.printf("카드번호 : 5387-20**-****-4613(S)일시불\n");
//		System.out.printf("거래일시 : %s\n", sdt.format(calt.getTime()));
//		System.out.printf("승인번호 : %s\n", "70404427");
//		System.out.printf("매입 : %s%5s", "비씨카드사", " ");
//		System.out.printf("가맹 : %s\n", "720068568");
//		System.out.printf("알림 : %s\n", "EDC매출표");
//		System.out.printf("문의 : %s\n", "TEL) 1544-4700");
//		System.out.printf("--------------------------------------\n");
//		System.out.printf("%13s%s\n", " " ,"* 감사합니다 *");
//		System.out.printf("%36s", "표준V2.08_20200212");
		//////////////////////////////

		//////////////////////////////
		// #8. 영수증 출력 (2)
		// 자바 한글 자르기 구글링
		// 바코드 표시는 생략
		// 최대치 37로 해도 될듯
//		DecimalFormat k10_df = new DecimalFormat("###,###,###,###,###");
//		Calendar k10_calt = Calendar.getInstance();
//		Calendar k10_future = Calendar.getInstance();
//		SimpleDateFormat k10_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
//		SimpleDateFormat k10_sdf = new SimpleDateFormat("MM월dd일");
//
//		k10_future.add(k10_future.DATE, 14);
//		String chkDate = k10_sdf.format(k10_future.getTime());
//
//		String k10_itemname1 = "퓨어에어 비말차단용마스크(최고급형)";
//		String k10_itemcode1 = "1031615";
//		int k10_price1 = 3000;
//		int k10_amount1 = 1;
//		int k10_total1 = k10_price1 * k10_amount1;
//
//		String k10_itemname2 = "슬라이드식명찰(가로형)(100호)";
//		String k10_itemcode2 = "11008152";
//		int k10_price2 = 1000;
//		int k10_amount2 = 1;
//		int k10_total2 = k10_price2 * k10_amount2;
//
//		String k10_itemname3 = "매직흡착 인테리어후크(알루미늄타입)";
//		String itemcode3 = "1020800";
//		int k10_price3 = 1000;
//		int k10_amount3 = 1;
//		int k10_total3 = k10_price3 * k10_amount3;
//
//		int k10_total4 = k10_total1 + k10_total2 + k10_total3;
//
//		System.out.printf("%13s\"국민가게, 다이소\"\n", " ");
//		System.out.printf("(주)아성다이소_분당서현점\n");
//		System.out.printf("전화:%s\n", "031-702-6016");
//		System.out.printf("본사:%s\n", "서울 강남구 남부순환로 2748 (도곡동)");
//		System.out.printf("대표:%s\n", "박정부,신호섭 213-81-52063");
//		System.out.printf("매장:%s\n", "경기도 성남시 분당구 분당로 53번길 11 (서현동)");
//		System.out.printf("==========================================\n");
//		System.out.printf("%8s소비자중심경형(CCM) 인증기업\n", " ");
//		System.out.printf("%6sISO 9001 품질경영시스템 인증기업\n", " ");
//		System.out.printf("==========================================\n");
//		System.out.printf("%7s교환/환불 14일(%s)이내,\n", " ", chkDate);
//		System.out.printf("%7s(전자)영수증, 결제카드 지참 후\n", " ");
//		System.out.printf("%13s구입매장에서 가능\n", " ");
//		System.out.printf("%6s포장/가격 택 훼손시 교환/환불 불가\n", " ");
//		System.out.printf("%7s체크카드 취소 시 최대 7일 소요\n", " ");
//		System.out.printf("==========================================\n");
//		System.out.printf("[POS 1058231]%9s", " ");
//		System.out.printf("%s\n", k10_sdt.format(k10_calt.getTime()));
//		System.out.printf("==========================================\n"); // 42?
//		System.out.printf("%s%s%s%2s%d%2s%s\n", lengthLimit(k10_itemname1, 36, ""), " ", k10_df.format(k10_price1), " ",
//				k10_amount1, " ", k10_df.format(k10_total1));
//		System.out.printf("[1031615]\n");
//		System.out.printf("%s%3s%s%2s%d%2s%s\n", lengthLimit(k10_itemname2, 31, ""), " ", k10_df.format(k10_price2),
//				" ", k10_amount2, " ", k10_df.format(k10_total2));
//		System.out.printf("[1008152]\n");
//		System.out.printf("%s%2s%s%2s%d%2s%s\n", lengthLimit(k10_itemname3, 35, ""), " ", k10_df.format(k10_price3),
//				" ", k10_amount3, " ", k10_df.format(k10_total3));
//		System.out.printf("[1020800]\n");
//		System.out.printf("%12s과세합계%16s%s\n", " ", " ", k10_df.format(k10_total4 * 0.909));
//		System.out.printf("%14s부가세%18s%s\n", " ", " ", k10_df.format(k10_total4 * 0.091));
//		System.out.printf("------------------------------------------\n");
//		System.out.printf("판매합계%28s%s\n", " ", k10_df.format(k10_total4));
//		System.out.printf("==========================================\n");
//		System.out.printf("신용카드%28s%s\n", " ", k10_df.format(k10_total4));
//		System.out.printf("------------------------------------------\n");
//		System.out.printf("우리카드%18s%s\n", " ", "538720**********");
//		System.out.printf("승인번호 %s%7s", "77982843(0)", " "); // 여기가 기준, 34
//		System.out.printf("승인금액 %s\n", k10_df.format(k10_total4));
//		System.out.printf("==========================================\n");
//		System.out.printf("%6s%s 분당서현점\n", " ", k10_sdt.format(k10_calt.getTime()));
//		System.out.printf("상품 및 기타 문의 : 1522-4400\n");
//		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
//		System.out.printf("\n%13s2112820610158231\n", " ");
//		System.out.printf("------------------------------------------\n");
//		System.out.printf("◈다이소 멤버십 앱 또는 홈페이지에 접속하셔");
//		System.out.printf("서 회원가입 후 다양한 혜택을 누려보세요!◈");
//	}
		//////////////////////////////

		//////////////////////////////
		// #9. 영수증 출력 (3)
		DecimalFormat k10_df = new DecimalFormat("###,###,###,###,###");
		Calendar k10_calt = Calendar.getInstance();
		SimpleDateFormat k10_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");

		String[] k10_itemname = { "초코파이", "바나나우유", "건포도", "오렌지주스", "초코에몽", "밀크티", "텀블러", "어항", "신라면", "짜파게티", "녹차티백",
				"커피믹스", "보드마카", "핸드크림", "모니터", "TV", "형광등", "아이폰", "아이패드", "운동화", "닭가슴살", "1.5L 우유", "1.5L콜라", "가디건",
				"목캔디", "컴퓨터", "그래픽카드", "A4용지", "초콜릿", "멀티탭" }; // %7s
		int[] k10_price = {3500, 1300, 2500, 2000, 1500, 3500, 5000, 5300, 2650, 2850, 5000, 5500, 3000, 6000, 200000,
				1000000, 5000, 600000, 950000, 120000, 3500, 4800, 3000, 55000, 4000, 1200000, 600000, 15000, 3500,
				5000 }; // %7s
		int[] k10_amount = {1, 5, 4, 6, 8, 9, 5, 3, 8, 6, 5, 3, 4, 10, 5, 1, 1, 5, 1, 1, 3, 4, 5, 5, 2, 5, 1, 1, 4, 4, 6}; // %2s
		
		System.out.printf("%15s이마트 죽전점 (031)888-1234\n", " ");
		System.out.printf("%15s206-86-50913 김희석\n", " ");
		System.out.printf("%15s용인 수지구 포은대로 552\n", " ");
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상제품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n\n");
		System.out.printf("[구 매]%s", k10_sdt.format(k10_calt.getTime()));
		System.out.printf("%3sPOS:0011-9861\n", " ");
		System.out.printf("------------------------------------------\n");
		System.out.printf("%2s상 품 명%4s단  가%3s수량%9s금  액\n", " ", " "," ", " ");
		for (int k10_i = 0; k10_i < k10_itemname.length; k10_i++) {
			if (k10_i % 5 == 0) {
				System.out.printf("------------------------------------------\n");
			}
			System.out.printf("%7s\n",k10_itemname[k10_i]);
			
		}
		System.out.printf("------------------------------------------\n"); // 이
		System.out.printf("0041 KB 국민%9s541707**0484/35860658\n", " "); // 세 문장이
		System.out.printf("------------------------------------------\n"); // 기준
	}
	//////////////////////////////

	public static String lengthLimit(String inputStr, int limit, String fixStr) { // #8. 한글 쪼개주는 메서드
		if (inputStr == null)
			return "";

		if (limit <= 0)
			return inputStr;

		byte[] strbyte = null;

		strbyte = inputStr.getBytes();

		if (strbyte.length <= limit) {
			return inputStr;
		}

		char[] charArray = inputStr.toCharArray();

		int checkLimit = limit;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] < 256) {
				checkLimit -= 1;
			} else {
				checkLimit -= 2;
			}

			if (checkLimit <= 0) {
				break;
			}
		}

		// 대상 문자열 마지막 자리가 2바이트의 중간일 경우 제거함
		byte[] newByte = new byte[limit + checkLimit];

		for (int i = 0; i < newByte.length; i++) {
			newByte[i] = strbyte[i];
		}

		if (fixStr == null) {
			return new String(newByte);
		} else {
			return new String(newByte) + fixStr;
		}
	}
}