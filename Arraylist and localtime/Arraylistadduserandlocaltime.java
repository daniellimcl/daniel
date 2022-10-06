package daniel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylistfilter {
	public static void main(String[] args) {
		List<User> list= new ArrayList<>();
		list.add(new User(10,"John"));
		list.add(new User(20,"Johnny"));
		list.add(new User(30,"Jack"));
		list.add(new User(40,"Joe"));
		list.add(new User(50,"Jan"));
		list.add(new User(50,"Bob"));
		list.add(new User(50,"Ben"));
		list.add(new User(50,"Billy"));
		list.add(new User(50,"Bean"));
		list.add(new User(50,"Barry"));
		
		
        Iterator<User> itr=list.iterator();
        while(itr.hasNext()) {
        	User User =itr.next();
        	System.out.println("age="+User.getAge()+" name="+User.getName());
        	
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDateTime Time = LocalDateTime.now();
        System.out.println(Time);
        LocalTime Time2 = LocalTime.now();
        System.out.println(Time2);
        
        
        }
	}
}