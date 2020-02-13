package services;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ServicesChoicePanel {

	public void executingServiceChoicePanel() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		RegisteringNewAccount objectToRegisterANewAccountClass = new RegisteringNewAccount();
		WithdrawOperation objectToWithdrawOperationClass = new WithdrawOperation();
		DepositOperation objectToDepositOperationClass = new DepositOperation();
		CheckingAccountInformation objectToCheckAccountInformationClass = new CheckingAccountInformation();

		int switchChoose;
		
		try {

			while (true) {

				System.out.println(
						"Hello! Welcome to your bank account system!" + " please select the operation you need.");
				System.out.println("1 - Register a New Account");
				System.out.println("2 - Make a Withdraw");
				System.out.println("3 - Make a Deposit");
				System.out.println("4 - Check Account Information");
				System.out.println("0 - Close The Program");
				switchChoose = sc.nextInt();

				switch (switchChoose) {

				case 0:
					System.out.println("--------" + "PROGRAM CLOSED" + "--------");
					System.exit(switchChoose);
					break;
				case 1:
					objectToRegisterANewAccountClass.registeringNewAccount();
					break;
				case 2:
					objectToWithdrawOperationClass.executingWithdrawOperation();
					break;
				case 3:
					objectToDepositOperationClass.executingDepositOperation();
					break;
				case 4:
					objectToCheckAccountInformationClass.checkingAccountInformationOperation();
					break;
				}
			}
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
