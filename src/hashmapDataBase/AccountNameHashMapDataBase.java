package hashmapDataBase;

import java.util.HashMap;
import java.util.Map;

//---------------------------OPERATIONS WITH ACCOUNT NAME-------------------------------------------------------//

public class AccountNameHashMapDataBase {

	private static Map<String, String> accountNameHashMap = new HashMap<>();
	
	public void getAccountNameHashMap(String userCPF) {
		System.out.println("Client Name: " + accountNameHashMap.get(userCPF));
	}
	
	public void setAccountNameHashMap(String cpfKey, String name) {
		accountNameHashMap.put(cpfKey, name);
	}
}
