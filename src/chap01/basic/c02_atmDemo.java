package chap01.basic;

import java.util.Scanner;

public class c02_atmDemo {
public static void main(String[] args) {
	int money = 0;
	final int FIVE_HUNDRED_THOUSAND = 500000,
	 TWO_HUNDRED_THOUSAND = 200000,
	 ONE_HUNDRED_THOUSAND = 100000,
	 FIFTY_THOUSAND = 50000,
	 TWENTY_THOUSAND = 20000,
	 TEN_THOUSAND = 10000;
	
	int fiveHundredThousand = 0, 
		twoHundredThousand = 0,
		oneHundredThousand = 0,
		fiftyThousand = 0,
		twentyThousand = 0,
	    tenThousand = 0;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.println("Your's money: ");
		money = sc.nextInt();
	} while (money % 10000 != 0);
	sc.close();
	
	if(money >= FIVE_HUNDRED_THOUSAND) {
		fiveHundredThousand = money / FIVE_HUNDRED_THOUSAND;
		money = money % FIVE_HUNDRED_THOUSAND;
		System.out.printf("Mệnh giá %d : %d", FIVE_HUNDRED_THOUSAND,fiveHundredThousand);
	}
	
	System.out.println(money);
	System.out.println(fiveHundredThousand);
}
}
