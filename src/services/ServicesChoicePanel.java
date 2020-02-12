package services;

import java.util.Scanner;

public class ServicesChoicePanel {

	public void executingServiceChoicePanel () {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		RegisteringNewAccount communicationToRegisterANewAccountClass = new RegisteringNewAccount();
		Withdrawing communicationToWithdrawOperationClass = new Withdrawing ();
		DepositOperation communicationToDepositOperationClass = new DepositOperation();
		CheckingAccountInformation communicationToCheckAccountInformationClass = new CheckingAccountInformation();

		
		int switchChoose;
		boolean loopState = true;
		
		while(loopState) {
			
			System.out.println("Hello! Welcome to your bank account system!"
							+ " please select the operation you need.");
			System.out.println("1 - Register a New Account");
			System.out.println("2 - Make a Withdraw");
			System.out.println("3 - Make a Deposit");
			System.out.println("4 - Check Account Information");
			System.out.println("5 - Check The Credit System");
			System.out.println("6 - Change an Account Information");
			System.out.println("0 - Close The Program");
			switchChoose = sc.nextInt();
			
			switch(switchChoose) {
			
				case 0:
					System.exit(switchChoose);
					break;
				case 1:
					communicationToRegisterANewAccountClass.registeringNewAccount();
					break;
				case 2:
					communicationToWithdrawOperationClass.executingWithdrawOperation();
					break;
				case 3:
					communicationToDepositOperationClass.executingDepositOperation();
				case 4:
					communicationToCheckAccountInformationClass.checkingAccountInformationOperation();
					break;
		}
		
		}
	}
}
