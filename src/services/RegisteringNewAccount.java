package services;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import databaseAndOperations.DataBaseHashMapAndOperations;

public class RegisteringNewAccount {
	
	private DataBaseHashMapAndOperations communicationWithTheHashMap = new DataBaseHashMapAndOperations ();
	
	public void registeringNewAccount () {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);

		String cpfNumberIsTheHashMapKey;
		String name;
		Integer registerNumber;
		int yearsOld;
		Double accountBalance;
		
		try {
			
			System.out.println("Please insert the new user information.");
			System.out.println("CPF: ");
			cpfNumberIsTheHashMapKey = sc.next();
			sc.nextLine();
			System.out.println("User Name: ");
			name = sc.nextLine();
			sc.nextLine();
			System.out.println("RG (National Register Number): ");
			registerNumber = sc.nextInt();
			System.out.println("User Years Old: ");
			yearsOld = sc.nextInt();
			System.out.println("User Inicial Account Balance: ");
			accountBalance = sc.nextDouble();
						
			communicationWithTheHashMap.setUserCPF(cpfNumberIsTheHashMapKey, cpfNumberIsTheHashMapKey);
			communicationWithTheHashMap.setAccountNameHashMap(cpfNumberIsTheHashMapKey, name);
			communicationWithTheHashMap.setUserRegisterNumberHashMap(cpfNumberIsTheHashMapKey, registerNumber);
			communicationWithTheHashMap.setUserYearsOldHashMap(cpfNumberIsTheHashMapKey, yearsOld);
			communicationWithTheHashMap.setUserAccountBalanceHashMap(cpfNumberIsTheHashMapKey, accountBalance);
			
			System.out.println("--------" + "ACCOUNT ADDED SUCESSFULL" + "--------");
		}
		catch (MissingFormatArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch (NoSuchElementException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
