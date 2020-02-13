package hashmapDataBase;

import java.util.HashMap;
import java.util.Map;

//---------------------------OPERATIONS WITH USER CPF------------------------------------------------------------//

public class CPFHashMapDataBase {

	
	private static Map<String, String> userCPF = new HashMap<>();

	public void getUserCPF(String userCpf) {
		System.out.println("Client CPF: " + userCPF.get(userCpf));
	}
	
	public void setUserCPF(String cpfKey, String cpf) {
		userCPF.put(cpfKey, cpf);
	}
}
