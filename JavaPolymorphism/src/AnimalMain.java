
public class AnimalMain {
	
	public static void main(String[] args) {
		Animal animal; //reference of interface
		
		animal=new Dog();
		animal.eat();
		animal.speak();
//		Dog dog=(Dog)animal;
//		dog.abc();
		
		animal=new Cat();
		animal.eat();
		animal.speak();
		
		animal=new Lion();
		animal.eat();
		animal.speak();
		
		animal=new Rabbit();
		animal.eat();
		animal.speak();
		
		
	}
	
}
