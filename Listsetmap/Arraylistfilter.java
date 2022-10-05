package daniel;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Arraylistfilter {
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(17);
		list.add(20);
		list.add(45);
		list.add(13);
		System.out.println(list);
        List<Integer> afterList =list.stream().filter(num -> num<30).collect(Collectors.toList());
        System.out.println(afterList);
}
}