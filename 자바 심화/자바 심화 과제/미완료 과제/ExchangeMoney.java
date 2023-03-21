package advanced;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ExchangeMoney {
	//////////////////////////////
	// 단순 환전 계산
	public static void main(String[] args) {
		int k10_myWon = 1000000;
		double k10_moneyEx = 1238.21;
		double k10_commission = 0.003;
		
		int k10_usd = (int)(k10_myWon / k10_moneyEx);
		int k10_remain = (int)(k10_myWon - (k10_usd * k10_moneyEx));
		
//		System.out.printf("***********************************************************\n");
//		System.out.printf("*			수수료없이 계산			  *\n");
//		System.out.printf("총 한화환전금액 : %d원 -> 미화 : %d달러, 잔돈 : %d원\n", k10_myWon, k10_usd, k10_remain);
//		System.out.printf("***********************************************************\n");
		//////////////////////////////
		
		//////////////////////////////
		// 수수료 포함 환전 계산 1
		double k10_ComPerOne = k10_moneyEx * k10_commission;
		double k10_totalcom = k10_usd * k10_ComPerOne;
		
//		System.out.printf("***********************************************************************\n");
//		System.out.printf("*			  수수료 계산			   	      *\n");
//		System.out.printf("총 수수료 : %f원 -> 미화 : %d달러, 달러당 수수료 : %f원\n", k10_totalcom, k10_usd, k10_ComPerOne);
//		System.out.printf("***********************************************************************\n");
		//////////////////////////////
		
		//////////////////////////////
		// 수수료 포함 환전 계산 2
		int k10_i_totalcom;
		
		if (k10_totalcom != (double)((int)k10_totalcom)) {
			k10_i_totalcom = (int)k10_totalcom + 1;
		} else {
			k10_i_totalcom = (int)k10_totalcom;
		}
		
//		System.out.printf("********************************************************************************\n");
//		System.out.printf("*			  수수료 적용환전			      *\n");
//		System.out.printf("총 수수료 : %d원 -> 미화 : %d달러, 달러당 수수료 : %f원\n", k10_i_totalcom, k10_usd, k10_ComPerOne);
//		
//		k10_remain = (int)(k10_myWon - k10_usd * k10_moneyEx - k10_i_totalcom);
//		System.out.printf("총 한화환전금액 : %d원 -> 미화 : %d달러, 수수료징수 : %d원 잔돈 : %d원\n", k10_myWon, k10_usd, k10_i_totalcom, k10_remain);
//		System.out.printf("********************************************************************************\n");
		//////////////////////////////
		
		//////////////////////////////
		// 수수료 포함 환전 계산 3
		k10_usd = (int)(k10_myWon / (k10_moneyEx + k10_ComPerOne));
		k10_totalcom = k10_usd * k10_ComPerOne;
		
		// 수수료 올림처리
		if (k10_totalcom != (double)((int)k10_totalcom)) {
			k10_i_totalcom = (int)k10_totalcom + 1;
		} else {
			k10_i_totalcom = (int)k10_totalcom;
		}
		
//		System.out.printf("*******************************************************************************\n");
//		System.out.printf("*			  (정확한)수수료 적용환전			      *\n");
//		System.out.printf("총 수수료 : %d원 -> 미화 : %d달러, 달러당 수수료 : %f원\n", k10_i_totalcom, k10_usd, k10_ComPerOne);
//		
//		k10_remain = (int)(k10_myWon - k10_usd * k10_moneyEx - k10_i_totalcom);
//		System.out.printf("총 한화환전금액 : %d원 -> 미화 : %d달러, 수수료징수 : %d원 잔돈 : %d원\n", k10_myWon, k10_usd, k10_i_totalcom, k10_remain);
//		System.out.printf("*******************************************************************************\n");
		//////////////////////////////
		
		//////////////////////////////
		// 콤마 찍기
		// 현재 날짜, 시간 찍기
		// 처음에는 베껴쓰고 점점 암기
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		
		System.out.printf("*******************************************************************************\n");
		System.out.printf("*			  	콤마 찍기			      	      *\n");
		System.out.printf("총 수수료 : %s원 -> 미화 : %s달러, 달러당 수수료 : %f원\n", df.format(k10_i_totalcom), df.format(k10_usd), k10_ComPerOne);
		
		k10_remain = (int)(k10_myWon - k10_usd * k10_moneyEx - k10_i_totalcom);
		System.out.printf("총 한화환전금액 : %s원 -> 미화 : %s달러, 수수료징수 : %s원 잔돈 : %s원\n", 
				df.format(k10_myWon), df.format(k10_usd), df.format(k10_i_totalcom), df.format(k10_remain));
		System.out.printf("최종실행시간 : %s\n", sdt.format(calt.getTime()));
		System.out.printf("*******************************************************************************\n");
		//////////////////////////////
	}

}