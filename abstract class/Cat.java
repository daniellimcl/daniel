package Animal;

public class Cat extends Animal implements Behaviour {

	@Override
	public void sleep() {
		System.out.println("zzzzz");
		
	}
	@Override
	public void makeSound() {
		System.out.println("meow meow");
		
	}

}
