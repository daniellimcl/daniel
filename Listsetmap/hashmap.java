package daniel;
import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		System.out.println();
		Map<String,String> Useradd=new HashMap<>();
		
		Useradd.put("Userone", "Jane");
		Useradd.put("Usertwo", "John");
		System.out.println(Useradd);
		String name  = Useradd.get("Usertwo");
		System.out.println(name + " is an employee of asdasd");
		
		


	}

}
