public class trycatch {

    public static void main(String[] args) {

        try {


            int[] a = {4, 5, 1};
            System.out.println(a[10]);

        }
        catch (Exception e){
            System.out.println("Array number is out of bounds. Used general exception");
        }
    }
}