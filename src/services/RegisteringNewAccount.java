package services;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import hashmapDataBase.AccountBalanceHashMapDataBase;
import hashmapDataBase.AccountNameHashMapDataBase;
import hashmapDataBase.CPFHashMapDataBase;
import hashmapDataBase.RegisterNumberHashMapDataBase;
import hashmapDataBase.YearsOldHashMapDataBase;

public class RegisteringNewAccount {

	public void registeringNewAccount() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		AccountNameHashMapDataBase objectToAccountName = new AccountNameHashMapDataBase();
		RegisterNumberHashMapDataBase objectToRegisterNumber = new RegisterNumberHashMapDataBase();
		CPFHashMapDataBase objectToCPF = new CPFHashMapDataBase();
		YearsOldHashMapDataBase objectToYearsOld = new YearsOldHashMapDataBase();
		AccountBalanceHashMapDataBase objectToAccountBalance = new AccountBalanceHashMapDataBase();

		String cpfNumberIsTheHashMapKey;
		String name;
		Integer registerNumber;
		int yearsOld;
		Double accountBalance;

		try {

			System.out.println("--------" + "CHECK ACCOUNT STATUS OPERATION AREA" + "--------");

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

			objectToCPF.setUserCPF(cpfNumberIsTheHashMapKey, cpfNumberIsTheHashMapKey);
			objectToAccountName.setAccountNameHashMap(cpfNumberIsTheHashMapKey, name);
			objectToRegisterNumber.setUserRegisterNumberHashMap(cpfNumberIsTheHashMapKey, registerNumber);
			objectToYearsOld.setUserYearsOldHashMap(cpfNumberIsTheHashMapKey, yearsOld);
			objectToAccountBalance.setUserAccountBalanceHashMap(cpfNumberIsTheHashMapKey, accountBalance);

			System.out.println("--------" + "ACCOUNT ADDED SUCESSFULL" + "--------");

		} catch (MissingFormatArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
