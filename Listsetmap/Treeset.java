package daniel;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		
		Set <Person> personList = new TreeSet<Person>();

        Person person1 = new Person();
        person1.setAge(45);
        person1.setName("John");


        Person person2 = new Person();
        person2.setAge(15);
        person2.setName("Joe");

        
		personList.add(person1);
        personList.add(person2);
        
	

	}

}
