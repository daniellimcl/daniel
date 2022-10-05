package daniel;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Treesetpractice {

    public static void main(String[] args) {
       TreeSet<String> stringList = new TreeSet<String >();
       stringList.add("Fries");
       stringList.add("Burger");
       stringList.add("Fries");
       stringList.add("Drinks");
        System.out.println(stringList);
      

        Collections.sort(stringList);

        System.out.println(stringList);


    }
}