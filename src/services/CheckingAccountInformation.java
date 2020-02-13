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

public class CheckingAccountInformation {

	public void checkingAccountInformationOperation() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		AccountNameHashMapDataBase objectToAccountName = new AccountNameHashMapDataBase();
		RegisterNumberHashMapDataBase objectToRegisterNumber = new RegisterNumberHashMapDataBase();
		CPFHashMapDataBase objectToCPF = new CPFHashMapDataBase();
		YearsOldHashMapDataBase objectToYearsOld = new YearsOldHashMapDataBase();
		AccountBalanceHashMapDataBase objectToAccountBalance = new AccountBalanceHashMapDataBase();

		try {

			System.out.println("--------" + "CHECK ACCOUNT STATUS OPERATION AREA" + "--------");

			System.out.println("Insert user CPF number: ");
			String cpfKey = sc.nextLine();

			objectToAccountName.getAccountNameHashMap(cpfKey);
			objectToRegisterNumber.getUserRegisterNumberHashMap(cpfKey);
			objectToCPF.getUserCPF(cpfKey);
			objectToYearsOld.getUserYearsOldHashMap(cpfKey);
			objectToAccountBalance.getUserAccountBalanceHashMap(cpfKey);

			System.out.println("--------" + "CHECK ACCOUNT STATUS SUCESSFULL" + "--------");

		}

		catch (MissingFormatArgumentException e) {
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
