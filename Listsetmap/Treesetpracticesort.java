package daniel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Treesetpracticesort {

	public static void main(String[] args) {
		TreeSet <String> mySet = new TreeSet<String>();
		
		mySet.add("Fries");
		mySet.add("Burger");
		mySet.add("Fries");
		mySet.add("Drinks");
	//  TreeSet <Integer> mySet = new TreeSet<Integer>();
	//	mySet.add(99);
	//	mySet.add(100);
	//	mySet.add(98);
	//	mySet.add(1);
	//	mySet.add(10);
		System.out.println(mySet);
		Iterator itr = mySet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
