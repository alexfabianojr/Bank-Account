package services;

import java.util.Scanner;

import databaseAndOperations.DataBaseHashMapAndOperations;

public class DepositOperation {
	
	public void executingDepositOperation () {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		DataBaseHashMapAndOperations communicationToDataBaseHashMap = new DataBaseHashMapAndOperations();
		
		String cpfIn;
		Double depositValue;
		
		try {
		System.out.println("Insert Client CPF: ");
		cpfIn = sc.next();
		System.out.println("DepositValue: ");
		depositValue = sc.nextDouble();
		
		communicationToDataBaseHashMap.depositAccountBalance(cpfIn, depositValue);
		
		System.out.println("--------" + "DEPOSIT SUCESSFULL" + "--------");
		}
		
		catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
