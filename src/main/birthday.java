package main;

import java.time.LocalDate;

public class birthday {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int days = 1;
		int year =2020;
		int month =12;
		int day =25;
		LocalDate currentDatePlus = LocalDate.now().plusDays(days);
		LocalDate currentDateMinus = LocalDate.now().minusDays(days);
		LocalDate datePlus = LocalDate.of(year, month, day).plusDays(days);
		LocalDate dateMinus = LocalDate.of(year, month, day).minusDays(days);
		System.out.println(currentDatePlus);
		System.out.println(currentDateMinus);
		System.out.println(datePlus);
		System.out.println(dateMinus);
		
	}
}
