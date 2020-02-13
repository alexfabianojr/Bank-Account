package services;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import hashmapDataBase.AccountBalanceHashMapDataBase;

public class WithdrawOperation {

	public void executingWithdrawOperation() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		AccountBalanceHashMapDataBase objectToAccountBalance = new AccountBalanceHashMapDataBase();

		String cpfHashMapKey;
		Double withdrawValue;

		try {

			System.out.println("--------" + "WITHDRAW OPERATION AREA" + "--------");

			System.out.println("Insert Client CPF: ");
			cpfHashMapKey = sc.next();

			System.out.println("Withdraw Value: ");
			withdrawValue = sc.nextDouble();

			objectToAccountBalance.withdrawAccountBalanceHashMap(cpfHashMapKey, withdrawValue);

			System.out.println("--------" + "WITHDRAW SUCESSFULL" + "--------");

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
