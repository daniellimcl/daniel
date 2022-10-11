import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap <Integer, String> test = new HashMap<Integer, String>();

        test.put(1001, "John");
        System.out.println(test.containsValue("John"));

        try {
            System.out.println(test.containsValue("Peter"));
        }catch (Exception e)

        {
            System.out.println("User not found");
        }




    }
}