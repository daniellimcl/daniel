package daniel;


public class Person implements Comparable<Person> {
    String name;
    int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
	 public int compare(Person p1, Person p2) {
	     
    	 if(p1.getAge() > p2.getAge()){
           return 1;
    }else if(p1.getAge() < p2.getAge()){
            return -1;
        }else{
           return 0;       }

}
	
	
}