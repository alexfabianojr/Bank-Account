package hashmapDataBase;

import java.util.HashMap;
import java.util.Map;

//---------------------------OPERATIONS WITH USER RG-------------------------------------------------------------//

public class RegisterNumberHashMapDataBase {
	
	private static Map<String, Integer> userRegisterNumberHashMap = new HashMap<>();
	
	public void getUserRegisterNumberHashMap(String userCPF) {
		System.out.println("Client RG: " + userRegisterNumberHashMap.get(userCPF));
	}
	
	public void setUserRegisterNumberHashMap(String cpfKey, Integer registerNumber) {
		userRegisterNumberHashMap.put(cpfKey, registerNumber);
	}
}
