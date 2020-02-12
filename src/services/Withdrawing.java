package services;

import java.util.Scanner;

import databaseAndOperations.DataBaseHashMapAndOperations;

public class Withdrawing {
	
	private Scanner sc = new Scanner (System.in);
	private DataBaseHashMapAndOperations communicationToDataBaseHashMap = new DataBaseHashMapAndOperations();
	
	private String cpfIn;
	private Double withdrawValue;
	
	public void executingWithdrawOperation () {
		
		try {
		System.out.println("Insert Client CPF: ");
		cpfIn = sc.next();
		
		System.out.println("Withdraw Value: ");
		withdrawValue = sc.nextDouble();
		
		communicationToDataBaseHashMap.withdrawAccountBalanceHashMap(cpfIn, withdrawValue);
		
		System.out.println("--------" + "WITHDRAW SUCESSFULL" + "--------");
		}
		catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}
