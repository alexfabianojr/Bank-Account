package services;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import hashmapDataBase.AccountBalanceHashMapDataBase;

public class DepositOperation {

	public void executingDepositOperation() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		AccountBalanceHashMapDataBase objectToAccountBalance = new AccountBalanceHashMapDataBase();

		String cpfKey;
		Double depositValue;

		try {

			System.out.println("--------" + "DEPOSIT OPERATION AREA" + "--------");

			System.out.println("Insert Client CPF: ");
			cpfKey = sc.next();

			System.out.println("DepositValue: ");
			depositValue = sc.nextDouble();

			objectToAccountBalance.depositAccountBalance(cpfKey, depositValue);

			System.out.println("--------" + "DEPOSIT SUCESSFULL" + "--------");

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
