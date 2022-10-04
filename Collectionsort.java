
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
public class Collectionsort {
    public static void main (String[] args){
        List<String> stringList = new ArrayList<>();
        stringList.add("Daniel");
        stringList.add("Peter");
        stringList.add("Jane");
        stringList.add("Alvin");
        System.out.println(stringList);

        Collections.sort(stringList);

        System.out.println(stringList);
    }
 }
