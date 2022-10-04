
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args){
        List<String> stringList = new ArrayList<>();
        stringList.add("Daniel");
        stringList.add("Alvin");
        stringList.add("Peter");
        stringList.add("Jane");
        System.out.println(stringList);

        Collections.sort(stringList);

        System.out.println(stringList);


    }



    }
