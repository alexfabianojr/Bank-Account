package hashmapDataBase;

import java.util.HashMap;
import java.util.Map;

//---------------------------OPERATIONS WITH ACCOUNT BALANCE-----------------------------------------------------//

public class AccountBalanceHashMapDataBase {

	private static Map<String, Double> userAccountBalanceHashMap = new HashMap<>();
	
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
