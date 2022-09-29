public class Main {

    static int Daysinmonth = 5;
    static String[] months = {"Jan", "Feb", "Mar"};
    static long [] numb = {123991l, 1231234123l, 123123132l};

    public static void main(String[] args) {

        if (Daysinmonth > 10) {
            System.out.println("Number is greater than 10");
        } else {
            System.out.println("It is less than 10");
        }

         for (int i = 0; i < 3; i++) {
             System.out.println (months[i]);

          }
        // System.out.println (Arrays.toString(numb)); // i cannot print this
       // System.out.println(Arrays.toString(intArray));
    }
}