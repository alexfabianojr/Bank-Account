package hashmapDataBase;

import java.util.HashMap;
import java.util.Map;

//---------------------------OPERATIONS WITH USER YEARS OLD------------------------------------------------------//

public class YearsOldHashMapDataBase {

	private static Map<String, Integer> userYearsOldHashMap = new HashMap<>();

	public void getUserYearsOldHashMap(String userCPF) {
		System.out.println("Client Years Old: " + userYearsOldHashMap.get(userCPF));
	}

	public void setUserYearsOldHashMap(String cpfKey, Integer userYearsOld) {
		userYearsOldHashMap.put(cpfKey, userYearsOld);
	}
}
