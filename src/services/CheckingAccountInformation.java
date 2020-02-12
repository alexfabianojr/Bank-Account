package services;

import java.util.Scanner;

import databaseAndOperations.DataBaseHashMapAndOperations;

public class CheckingAccountInformation {
	
	private DataBaseHashMapAndOperations communicationToHashMap = new DataBaseHashMapAndOperations();
	
	public void checkingAccountInformationOperation () {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insert user CPF number: ");
		String cpfKeyToSearch = sc.nextLine();
		
		communicationToHashMap.getAccountNameHashMap(cpfKeyToSearch);
		communicationToHashMap.getUserRegisterNumberHashMap(cpfKeyToSearch);
		communicationToHashMap.getUserCPF(cpfKeyToSearch);
		communicationToHashMap.getUserYearsOldHashMap(cpfKeyToSearch);
		communicationToHashMap.getUserAccountBalanceHashMap(cpfKeyToSearch);
		
		System.out.println("--------" + "CHECK ACCOUNT STATUS SUCESSFULL" + "--------");
	}
}
