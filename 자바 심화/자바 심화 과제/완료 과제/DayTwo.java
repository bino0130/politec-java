package advanced;

public class DayTwo {

	public static void main(String[] args) {
		//////////////////////////////
//		String k10_jumin = "123456-1234567"; // 주민번호 초기화
//		
//		switch (k10_jumin.charAt(7)) { // switch case 사용
//		case '1' :
//			System.out.printf("20세기전 태어난 남자 사람\n"); // break가 없어서 case1을 출력하고 밑에 있는 case 2까지 출력하게 된다
//		case '2' :
//			System.out.printf("20세기전 태어난 여자 사람\n"); // 여기서부턴 break 존재
//			break;
//		case '3' :
//			System.out.printf("20세기후 태어난 남자 사람\n"); // 뒷자리 맨 앞의 숫자가 3이면 20세기 이후에 태어난 남자
//			break;
//		case '4' :
//			System.out.printf("20세기후 태어난 여자 사람\n"); // 뒷자리 맨 앞의 숫자가 4면 20세기 이후에 태어난 여자
//			break;
//		default :
//			System.out.printf("사람\n"); // 1,2,3,4에 모두 해당하지 않을 경우 default 출력
//			break;
//	}
		//////////////////////////////

		//////////////////////////////
//		int k10_sum = 0; // 총합 변수 sum을 0으로 초기화
//		
//		for (int i = 0; i < 10; i++) { // 0부터 9까지 더하는 반복문 생성
//			k10_sum += i;
//		}
//		System.out.printf("sum : %d\n", k10_sum); // 0부터 9까지의 합인 45 출력
//		
//		for (int i = 1; i < 10; i++) { // 구구단 1단부터 9단까지 출력하는 반복문 생성
//			System.out.printf("******************************\n");  // 구구단 상단 별찍기
//			System.out.printf("	구구단 %d 단\n", i);			    // 구구단 n단 제목 출력
//			System.out.printf("******************************\n");  // 구구단 하단 별찍기
//			for (int j = 1; j < 10; j++) {							// 구구단 n단 출력
//				System.out.printf("	 %d * %d = %d \n", i, j, i * j);
//			}
//		}
		//////////////////////////////

		//////////////////////////////
		// 별찍기 단순비교
//		int k10_iA, k10_iB; // 변수 iA,iB 선언
//		
//		k10_iA = 0; // iA를 0으로 초기화
//		while(true) {
//			k10_iB = 0; // while 반복문을 처음 시행시 iB를 0으로 초기화
//			while(true) {
//				System.out.printf("*"); // 별 찍기
//				
//				if (k10_iA == k10_iB) break; // iA와 iB가 같을 때 반복문 탈출
//				k10_iB++; // iA와 iB가 같지 않으면 iB 1씩 증가
//			}
//			System.out.printf("\n"); // 줄 바꾸기
//			k10_iA++; // iA 1 증가 후 다시 처음으로
//			if(k10_iA == 30) break; // 만약 iA가 30이라면 반복문 탈출
//		}
		//////////////////////////////

		//////////////////////////////
		// 숫자형, 문자형 비교
//		int k10_iI;
//		double k10_iD;
//		
//		k10_iI = 10 / 3;
//		k10_iD = 10 / 3.0;
//		
//		// int와 double은 정수형 연산과 실수형 연산이다.
//		if (k10_iI == k10_iD) System.out.printf("equal\n"); // iI와 iD는 서로 다르다
//		else System.out.printf("Not equal[%f][%f]\n", (double)k10_iI, k10_iD); // 3.0과 3.3은 다르므로 not equal이 출력된다
//		
//		// 단지 유효숫자까지 표시된 것 뿐이지 다르다.
//		if (k10_iD == 3.333333) System.out.printf("equal\n"); // 가려진것 뿐이지 뒤에 무수히 많은 3이 존재
//		else System.out.printf("Not equal[3.333333][%f]\n",k10_iD); // 같은 형태의 3.333333이지만 iD의 3.333333은 사실상 무한소수이므로 서로 다르다
//		
//		k10_iD = (int)k10_iD; // iD를 int로 형변환
//		if (k10_iI == k10_iD) System.out.printf("equal\n"); // 3.333333을 int형으로 형변환 했으므로 3이 출력됨
//		else System.out.printf("Not equal[%f][%f]\n", (double)k10_iI, k10_iD); // int형 iI와 형변환한 iD는 같다
//		
//		System.out.printf("int로 인쇄[%d][%f]\n", k10_iI, k10_iD); // iI와 형변환된 iD 출력
//		System.out.printf("double로 인쇄[%f][%f]\n", (double)k10_iI,k10_iD); //iI를 double로 형변환 해서 출력
//		
//		char k10_a = 'c'; // 문자형 변수 a를 'c'라고 초기화
//		
//		if (k10_a == 'b') System.out.printf("a는 b다\n"); // false
//		if (k10_a == 'c') System.out.printf("a는 c다\n"); // true
//		if (k10_a == 'd') System.out.printf("a는 d다\n"); // false
//		// char형의 동일 비교는 ==으로 한다
//		
//		String k10_aa = "abcd"; // String 변수 aa를 "abcd"라고 초기화
//		
//		if (k10_aa.equals("abcd")) System.out.printf("aa는 abcd이다\n"); // true 
//		else System.out.printf("aa는 abcd가 아니다\n"); // false
//		// String형의 동일 비교는 .equals("")로 한다
//		
//		boolean k10_bb = true; // boolean형 변수 bb를 true라고 초기화
//		
//		if(!!k10_bb) System.out.printf("bb가 아니고 아니면 참이다\n"); // 부정의 부정은 긍정
//		else System.out.printf("bb가 아니고 아니면 거짓이다\n"); //false
//		// not 기호인 !를 두번 연달아 쓰면 true인지 비교
		//////////////////////////////

		//////////////////////////////
		// 범위를 주어서 찾기
//		int k10_iVal; // int형 변수 iVal 선언
//		
//		for (int k10_i = 0; k10_i < 300; k10_i++) { // 0부터 299까지 작동하는 반복문 출력
//			k10_iVal = 5 * k10_i; // i에 5를 곱한다.
//			if (k10_iVal >= 0 && k10_iVal < 10) System.out.printf("일 %d\n", k10_iVal); // iVal이 1에서 10 미만이라면 일 + @ 출력
//			else if (k10_iVal >= 10 && k10_iVal < 100) System.out.printf("십 %d\n", k10_iVal); // iVal이 10에서 100 미만이라면 십 + @ 출력
//			else if (k10_iVal >= 100 && k10_iVal < 1000) System.out.printf("백 %d\n", k10_iVal); // iVal이 100에서 1000 미만이라면 백 + @ 출력
//			else System.out.printf("천 %d\n", k10_iVal); // iVal이 1000 이상이라면 천 + @ 출력
//		}
//		
//		for (int k10_i = 0; k10_i < 20; k10_i++) { // 0부터 19까지 돌아가는 반복문 출력
//			k10_iVal = 5 - k10_i; // 5에서 i 뺀다
//			if (k10_iVal > 0 && k10_iVal < 10) System.out.printf("양수 %d\n", k10_iVal); // iVal이 양수라면 양수 + @
//			else if (k10_iVal == 0) System.out.printf("0\n"); // iVal이 0이라면 0 출력
//			else  if (k10_iVal < 0) System.out.printf("음수 %d\n", k10_iVal); // iVal이 음수라면 음수 + @ 출력
//		}
		//////////////////////////////

		//////////////////////////////
//		 달마다 끝에 날짜에 마침표 찍기
//		for (int k10_i = 1; k10_i < 13; k10_i++) { // 1월부터 12월까지 반복문 실행
//			System.out.printf(" %d월 ->", k10_i); // 1~ 12월까지 %d월 출력
//			for (int k10_j = 1; k10_j < 32; k10_j++) { // 1일부터 31까지 반복문 실행
//
//				if (k10_i == 1) { // 1월일때
//					if (k10_j < 31) {
//						System.out.printf("%d,", k10_j);
//					} else if (k10_j == 31) { // 31일일때 마침표 찍고 break
//						System.out.printf("%d.", k10_j);
//						break;
//					}
//				}
//				if (k10_i == 2) { // 2월일때
//					if (k10_j < 28) {
//						System.out.printf("%d,", k10_j);
//					} else if (k10_j == 28) { // 28일일때 마침표 찍고 break
//						System.out.printf("%d.", k10_j);
//						break;
//					}
//				}
//				if (k10_i == 3) { // 3월일때
//					if (k10_j < 31) {
//						System.out.printf("%d,", k10_j);
//					} else if (k10_j == 31) { // 31일일때 마침표 찍고 break
//						System.out.printf("%d.", k10_j);
//						break;
//					}
//				}
//				if (k10_i == 4) { // 4월일때
//					if (k10_j < 30) {
//						System.out.printf("%d,", k10_j);
//					} else if (k10_j == 30) { // 30일일때 마침표 찍고 break
//						System.out.printf("%d.", k10_j);
//						break;
//					}
//				}
//				if (k10_i == 5) { // 5월일때
//					if (k10_j < 31) {
//						System.out.printf("%d,", k10_j);
//					} else if (k10_j == 31) { // 31일일때 마침표 찍고 break
//						System.out.printf("%d.", k10_j);
//						break;
//					}
//				}
//				if (k10_i == 6) { // 6월일때
//					if (k10_j < 30) {
//						System.out.printf("%d,", k10_j);
//					} else if (k10_j == 30) { // 30일일때 마침표 찍고 break
//						System.out.printf("%d.", k10_j);
//						break;
//					}
//				}
//				if (k10_i == 7) { // 7월일때
//					if (k10_j < 31) {
//						System.out.printf("%d,", k10_j);
//					} else if (k10_j == 31) { // 31일일때 마침표 찍고 break
//						System.out.printf("%d.", k10_j);
//						break;
//					}
//				}
//				if (k10_i == 8) { // 8월일때
//					if (k10_j < 31) {
//						System.out.printf("%d,", k10_j);
//					} else if (k10_j == 31) { // 31일일때 마침표 찍고 break
//						System.out.printf("%d.", k10_j);
//						break;
//					}
//				}
//				if (k10_i == 9) { // 9월일때
//					if (k10_j < 30) {
//						System.out.printf("%d,", k10_j);
//					} else if (k10_j == 30) { // 30일일때 마침표 찍고 break
//						System.out.printf("%d.", k10_j);
//						break;
//					}
//				}
//				if (k10_i == 10) { // 10월일때
//					if (k10_j < 31) {
//						System.out.printf("%d,", k10_j);
//					} else if (k10_j == 31) { // 31일일때 마침표 찍고 break
//						System.out.printf("%d.", k10_j);
//						break;
//					}
//				}
//				if (k10_i == 11) { // 11월일때
//					if (k10_j < 30) {
//						System.out.printf("%d,", k10_j);
//					} else if (k10_j == 30) { // 30일일때 마침표 찍고 break
//						System.out.printf("%d.", k10_j);
//						break;
//					}
//				}
//				if (k10_i == 12) { // 12월일때
//					if (k10_j < 31) {
//						System.out.printf("%d,", k10_j);
//					} else if (k10_j == 31) { // 31일일때 마침표 찍고 break
//						System.out.printf("%d.", k10_j);
//						break;
//					}
//				}
//			}
//			System.out.println(); // 한줄 띄우기
//		}
		//////////////////////////////

		//////////////////////////////
		// 비정형비교 2
//		for (int k10_i = 1; k10_i < 13; k10_i++) { // 1부터 12까지 돌아가는 반복문 실행
//			System.out.printf(" %d월 ->", k10_i); // 1월부터 12월까지 출력
//			for (int k10_j = 1; k10_j < 32; k10_j++) { // 1부터 31까지 돌아가는 반복문 실행 
//				System.out.printf("%d, ", k10_j); // 날짜 출력
//				
//				if (k10_i == 4 || k10_i == 6 || k10_i == 7 || k10_i == 9 || k10_i == 11) { // 4,6,7,9,11월일때
//					if(k10_j == 30) break; // 30일에서 종료
//				}
//				
//				if (k10_i == 2) { // 2월일때
//					if(k10_j == 28) break; // 28일에서 종료
//				}
//			}
//			System.out.printf("\n"); // 개행
//		}
		//////////////////////////////

		//////////////////////////////
		// 비정형비교 3
		// 앞에처럼 쓰는걸 권장. 프로그램이 익숙해지면 이것도 무난함
//		for (int k10_i = 1; k10_i < 13; k10_i++) { // 1부터 12까지 돌아가는 반복문 실행
//			System.out.printf(" %d월 ->", k10_i); // 1월부터 12월까지 출력
//			for (int k10_j = 1; k10_j < 32; k10_j++) { // 1부터 31까지 돌아가는 반복문 실행
//				
//				System.out.printf("%d,", k10_j); // 날짜 출력
//				
//				// 4,6,7,9,11월일때 30일에서 종료
//				if((k10_i == 4 || k10_i == 6 || k10_i == 7 || k10_i == 9 || k10_i == 11) && (k10_j == 30)) break;
//				// 2월일때 28일에서 종료
//				if(k10_i == 2 && k10_j == 28) break;
//			}
//			System.out.println(); // 개행
//		}
		//////////////////////////////

		//////////////////////////////
		// case문 비교
//		for (int k10_i = 1; k10_i < 13; k10_i++) { // 1부터 12까지 돌아가는 반복문 실행
//			System.out.printf(" %d월 ->", k10_i); // 1월부터 12월까지 출력
//			LOOP:for(int k10_j = 1; k10_j < 32; k10_j++) { // 1부터 31까지 돌아가는 반복문 실행
//				
//				System.out.printf("%d,", k10_j); // 날짜 출력
//				
//				switch(k10_i) { // switch case문 사용
//				case 4: case 6: case 7: case 9: case 11:  // 4,6,7,9,11월일때
//					if (k10_j == 30) break LOOP; // 30일에서 종료
//					// 거의 이런 표현은 안함
//					// LOOP라는 표시자가 없으면 엉뚱한 결과 출력
//					break;
//				case 2: // 2월일때
//					if (k10_j == 28) break LOOP; // 28일에서 종료
//					break;
//				}
//			}
//			System.out.println(); // 개행
//		}
		//////////////////////////////

		//////////////////////////////
		// 비정형 비교가 애매할때는 배열을 사용하는 것도 방법이다
//		int [] k10_iLMD = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	 // 배열은 0부터 시작한다. iLMD[0] ~ iLMD[11]
//		
//		for (int k10_i = 1; k10_i < 13; k10_i++) { // 1부터 12까지 돌아가는 반복문 실행
//			System.out.printf(" %d월 ->", k10_i); // 1월부터 12월까지 출력
//			for (int k10_j = 1; k10_j < 32; k10_j++) { // 1부터 31까지 돌아가는 반복문 실행
//				
//				System.out.printf("%d", k10_j); // 날짜 출력
//				
//				if (k10_iLMD[k10_i - 1] == k10_j) break; // 마지막 날짜에 콤마 생략 
//				
//				System.out.printf(","); // 콤마 찍기
//			}
//			System.out.println(); // 개행
//		}
		//////////////////////////////

		//////////////////////////////
		// 범위를 주는것, 숫자 자르기
//		String [] k10_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"}; // units라는 배열에 0부터 9까지 값 초기화
//		for (int k10_j = 0; k10_j < 101; k10_j++) { // 0부터 100까지 돌아가는 반복문 입력
//			if (k10_j >= 0 && k10_j < 10) { // i가 0부터 9일때
//				System.out.printf("일의자리 : %s\n", k10_units[k10_j]); // 일의자리 0부터 9까지 출력
//			} else if (k10_j >= 10 && k10_j < 100) { // i가 10부터 99일때 
//				int k10_i10, k10_i0; // 변수 i10, i0 선언
//				k10_i10 = k10_j / 10; // 십의 자리
//				k10_i0 = k10_j % 10; // 일의 자리
//				if (k10_i0 == 0) { // i가 10의 배수일때
//					System.out.printf("십의자리 : %s십\n", k10_units[k10_i10]); // 십의 자리만 출력하고 일의 자리는 출력하지 않는다.
//				} else { // i가 10의 배수가 아닐때
//					System.out.printf("십의자리 : %s십%s\n", k10_units[k10_i10], k10_units[k10_i0]); // 십의 자리와 일의 자리 모두 출력 
//				}
//			}
//			else System.out.printf("-> %d\n", k10_j); // i가 100이 되면 100 출력
//		}
		//////////////////////////////

		//////////////////////////////
		// 띄어쓰기 연습
//		for (int k10_i = 0; k10_i < 10; k10_i++) { // i가 0 부터 9까지 작동하는 반복문 실행
//			for (int k10_j = 0; k10_j < k10_i; k10_j++) { // j가 0부터 i - 1까지 작동하는 반복문 실행 (2중 for문)
//				System.out.printf(" "); // 공백 출력
//			}
//			System.out.printf("%d\n", k10_i); // i 출력
//		}
		//////////////////////////////

		//////////////////////////////
		// 숫자읽기 고급
		int k10_iNumVal = 2000000000; // int형 변수 iNumVal 2147483647로 값 초기화

		String k10_sNumVal = String.valueOf(k10_iNumVal); // int형 변수 iNumVal을 String형 변수 sNumVal로 변환
		String k10_sNumVoice = ""; // String형 변수 sNumVoice ""으로 초기화
		System.out.printf("-> %s [%d자리]\n", k10_sNumVal, k10_sNumVal.length()); // 2147483647, [10자리] 출력
		int k10_i, k10_j; // int형 변수 i,j 선언

		String[] k10_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" }; // units라는 배열에 0부터 9까지 값 초기화
		String[] k10_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" }; // unitX라는 배열에 ""부터 "십"까지 값 초기화

		k10_i = 0; // 변수 i 0으로 초기화
		k10_j = k10_sNumVal.length() - 1; // 변수 j sNumVal.length() - 1로 초기화
		
		while(true) { // 무한루프문
			if(k10_i >= k10_sNumVal.length()) break; // 만약 i값이 sNumVal의 길이와 같으면 break
			
			System.out.printf("%s[%s]", 
					k10_sNumVal.substring(k10_i, k10_i + 1), // sNumVal의 i번째 자리 문자를 %s에 대입
					
					// sNumVal의 i번째 자리 문자를 정수형으로 바꾼게 x라고 했을 때,
					// 배열 units의 units[x]번째 자리에 있는 String 문자를 [%s]에 대입
					k10_units[Integer.parseInt(k10_sNumVal.substring(k10_i, k10_i + 1))]);
			
			if(k10_sNumVal.substring(k10_i, k10_i + 1).equals("0")) { // sNumVal의 i번째 자리 문자가 0이라면
				
				if (k10_sNumVal.length() < 9 && k10_sNumVal.length() > 5) { // sNumVal의 길이가 십만에서 천만일때
					if (k10_unitX[k10_j].equals("만") == true) { // unitX의 [j]번째 자리가 0이고 '만'이라면
						k10_sNumVoice += "" + k10_unitX[k10_j]; // '만'만 출력
					}
				} else if ( k10_sNumVal.length() > 8) { // sNumVal의 길이가 억 이상일때
					if(k10_unitX[k10_j].equals("만") == false && k10_unitX[k10_j].equals("억") == true) {  // // unitX의 [j]번째 자리가 0이고 '억'이라면
						k10_sNumVoice += "" + k10_unitX[k10_j]; // '억'만 출력
					}
				}
			} else { // sNumVal의 i번째 자리 문자가 0이 아니면
				k10_sNumVoice = k10_sNumVoice
						
								// sNumVal의 i번째 문자를 정수형으로 바꾼 걸 X라고 했을때
								// 배열 units의 units[X] 번째 문자
							+	k10_units[Integer.parseInt(k10_sNumVal.substring(k10_i, k10_i + 1))]
									
								// 배열 unitX의 unitX[j] 번째 문자
							+	k10_unitX[k10_j];
			}
			k10_i++; k10_j--; // i와 j 각각 1씩 증가
		}
		System.out.printf("\n %s[%s]\n", k10_sNumVal, k10_sNumVoice); //sNumVal과 sNumVoice 출력
	}

}