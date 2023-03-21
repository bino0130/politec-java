package advanced;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ExchangeMoney {
	//////////////////////////////
	// 단순 환전 계산
	public static void main(String[] args) {
		int k10_myWon = 1000000; // 환전할 금액 100만원 초기화
		double k10_moneyEx = 1238.21; // 달러 환율
		double k10_commission = 0.003; // 환전 수수료
		
		int k10_usd = (int)(k10_myWon / k10_moneyEx); // 최종 결과를 정수형으로 만들면 버림처리가 된다. 전체금액을 환율로 나누기
		int k10_remain = (int)(k10_myWon - (k10_usd * k10_moneyEx)); // 고객에게 돌려줄 잔돈도 당연히 소숫점이하의 금액은 삥땅해야한다. 여기선 계산 후 버림처리
																	  // 전체금액에서 달러금액 (달러*환율)을 뺐다. 만약 2324.22원 이런식으로 나온다면 0.22원은 은행이 가지게 해라. 주기도 애매함
		System.out.printf("***********************************************************\n"); // 영수증 상단 별 찍기
		System.out.printf("*			수수료없이 계산			  *\n");
		System.out.printf("총 한화환전금액 : %d원 -> 미화 : %d달러, 잔돈 : %d원\n", k10_myWon, k10_usd, k10_remain);
		System.out.printf("***********************************************************\n"); // 영수증 하단 별 찍기
		//////////////////////////////
		
		//////////////////////////////
		// 수수료 포함 환전 계산 1
		double k10_ComPerOne = k10_moneyEx * k10_commission; // 1달러당 수수료
		double k10_totalcom = k10_usd * k10_ComPerOne; // 총 수수료
		
//		System.out.printf("***********************************************************************\n"); // 영수증 상단 별 찍기
//		System.out.printf("*			  수수료 계산			   	      *\n");
//		System.out.printf("총 수수료 : %f원 -> 미화 : %d달러, 달러당 수수료 : %f원\n", k10_totalcom, k10_usd, k10_ComPerOne);
//		System.out.printf("***********************************************************************\n"); // 영수증 하단 별 찍기
		//////////////////////////////
		
		//////////////////////////////
		// 수수료 포함 환전 계산 2
		int k10_i_totalcom; // 변수 i_totalcom 선언
		
		if (k10_totalcom != (double)((int)k10_totalcom)) {		// totalcom이 소수점을 가질때
			k10_i_totalcom = (int)k10_totalcom + 1;				// totalcom에 + 1 해준 뒤 int로 형변환
		} else {												// totalcom이 정수형일때는
			k10_i_totalcom = (int)k10_totalcom;					// 그대로 출력
		}
		
//		System.out.printf("********************************************************************************\n"); // 영수증 상단 별 찍기
//		System.out.printf("*			  수수료 적용환전			      *\n"); // 수수료 계산
//		System.out.printf("총 수수료 : %d원 -> 미화 : %d달러, 달러당 수수료 : %f원\n", k10_i_totalcom, k10_usd, k10_ComPerOne);
//		
//		k10_remain = (int)(k10_myWon - k10_usd * k10_moneyEx - k10_i_totalcom); // 잔돈 계산
//		System.out.printf("총 한화환전금액 : %d원 -> 미화 : %d달러, 수수료징수 : %d원 잔돈 : %d원\n", k10_myWon, k10_usd, k10_i_totalcom, k10_remain);
//		System.out.printf("********************************************************************************\n"); // 영수증 하단 별 찍기
		//////////////////////////////
		
		//////////////////////////////
		// 수수료 포함 환전 계산 3
		k10_usd = (int)(k10_myWon / (k10_moneyEx + k10_ComPerOne)); // 환전달러 (1,2번 예제에서는 usd 변수를 구하는 식의 분모에 moneyEx만 사용했으나 3번에서는 moneyEx + ComPerOne을 같이 사용한다.)
		k10_totalcom = k10_usd * k10_ComPerOne; // 총 수수료
		
		// 수수료 올림처리
		if (k10_totalcom != (double)((int)k10_totalcom)) { // totalcom이 소수점을 가질때
			k10_i_totalcom = (int)k10_totalcom + 1;			// totalcom에 + 1 해준 뒤 int로 형변환
		} else {											// totalcom이 정수형일때는
			k10_i_totalcom = (int)k10_totalcom;				// 그대로 출력
		}
		
//		System.out.printf("*******************************************************************************\n");  // 영수증 상단 별 찍기
//		System.out.printf("*			  (정확한)수수료 적용환전			      *\n"); // 수수료 계산
//		System.out.printf("총 수수료 : %d원 -> 미화 : %d달러, 달러당 수수료 : %f원\n", k10_i_totalcom, k10_usd, k10_ComPerOne); // 총 수수료 / 미화 / 달러당 수수료 출력
//		
//		k10_remain = (int)(k10_myWon - k10_usd * k10_moneyEx - k10_i_totalcom); // 잔돈 계산
//		System.out.printf("총 한화환전금액 : %d원 -> 미화 : %d달러, 수수료징수 : %d원 잔돈 : %d원\n", k10_myWon, k10_usd, k10_i_totalcom, k10_remain); // 제대로 나온다
//		System.out.printf("*******************************************************************************\n");	 // 영수증 하단 별 찍기
		//////////////////////////////
		
		//////////////////////////////
		// 콤마 찍기
		// 현재 날짜, 시간 찍기
		// 처음에는 베껴쓰고 점점 암기
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");
		Calendar calt = Calendar.getInstance(); // Calendar 클래스 사용
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // SimpleDateFormat 클래스로 출력형식 지정
		
		System.out.printf("*******************************************************************************\n"); // 영수증 상단 별 찍기
		System.out.printf("*			  	콤마 찍기			      	      *\n"); // 콤마 찍기
		System.out.printf("총 수수료 : %s원 -> 미화 : %s달러, 달러당 수수료 : %f원\n", df.format(k10_i_totalcom), df.format(k10_usd), k10_ComPerOne); // 기존 %d들 모두 %s로 변경
		
		k10_remain = (int)(k10_myWon - k10_usd * k10_moneyEx - k10_i_totalcom); // 잔돈 계산
		System.out.printf("총 한화환전금액 : %s원 -> 미화 : %s달러, 수수료징수 : %s원 잔돈 : %s원\n", 
				df.format(k10_myWon), df.format(k10_usd), df.format(k10_i_totalcom), df.format(k10_remain)); // 기존 %d들 모두 %s로 변경
		System.out.printf("최종실행시간 : %s\n", sdt.format(calt.getTime()));
		System.out.printf("*******************************************************************************\n"); // 영수증 하단 별 찍기
		//////////////////////////////
	}

}