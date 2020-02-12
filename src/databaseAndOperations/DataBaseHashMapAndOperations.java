package databaseAndOperations;

import java.util.HashMap;
import java.util.Map;

public class DataBaseHashMapAndOperations {
	
	private static Map<String, String> accountNameHashMap = new HashMap<>();
	private static Map<String, String> userCPF = new HashMap<>();
	private static Map<String, Integer> userRegisterNumberHashMap = new HashMap<>();
	private static Map<String, Integer> userYearsOldHashMap = new HashMap<>();
	private static Map<String, Double> userAccountBalanceHashMap = new HashMap<>();

//---------------------------OPERATIONS WITH ACCOUNT NAME-------------------------------------------------------//
	public void getAccountNameHashMap(String userCPF) {
		System.out.println("Client Name: " + accountNameHashMap.get(userCPF));
	}
	public void setAccountNameHashMap(String cpfKey, String name) {
		accountNameHashMap.put(cpfKey, name);
	}
//---------------------------OPERATIONS WITH USER CPF------------------------------------------------------------//
	public void getUserCPF(String userCpf) {
		System.out.println("Client CPF: " + userCPF.get(userCpf));
	}
	public void setUserCPF(String cpfKey, String cpf) {
		userCPF.put(cpfKey, cpf);
	}
//---------------------------OPERATIONS WITH USER RG-------------------------------------------------------------//
	public void getUserRegisterNumberHashMap(String userCPF) {
		System.out.println("Client RG: " + userRegisterNumberHashMap.get(userCPF));
	}
	public void setUserRegisterNumberHashMap(String cpfKey, Integer registerNumber) {
		userRegisterNumberHashMap.put(cpfKey, registerNumber);
	}
//---------------------------OPERATIONS WITH USER YEARS OLD------------------------------------------------------//
	public void getUserYearsOldHashMap(String userCPF) {
		System.out.println("Client Years Old: " + userYearsOldHashMap.get(userCPF));
	}
	public void setUserYearsOldHashMap(String cpfKey, Integer userYearsOld) {
		userYearsOldHashMap.put(cpfKey, userYearsOld);
	}
//---------------------------OPERATIONS WITH ACCOUNT BALANCE-----------------------------------------------------//
	public void getUserAccountBalanceHashMap(String userCPF) {
		System.out.println("Client Account Balance: " + userAccountBalanceHashMap.get(userCPF));
	}
	public void setUserAccountBalanceHashMap(String cpfKey, Double userAccountBalance) {
		userAccountBalanceHashMap.put(cpfKey, userAccountBalance);
	}
	public void withdrawAccountBalanceHashMap (String cpfKey, Double withdrawBalance) {
		Double balance = userAccountBalanceHashMap.get(cpfKey);
		Double operation = (balance -= withdrawBalance);
		if (withdrawBalance <= balance) {
		userAccountBalanceHashMap.put(cpfKey, operation);
		}
		else {
			System.out.println("Error");
		}
	}
	public void depositAccountBalance (String cpfKey, Double depositValue) {
		Double balance = userAccountBalanceHashMap.get(cpfKey);
		Double operationDeposit = (balance += depositValue);
		userAccountBalanceHashMap.put(cpfKey, operationDeposit);
	}
}