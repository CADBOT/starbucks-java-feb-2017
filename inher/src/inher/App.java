package inher;

public class App {
  public static void main() {
	  System.out.println("hello");
	  Pet d = new Dog("black", "german shepard", 4, "chewy bone", false, "woof");
	  Cat c = new Cat("white", "munchkin", 1, "owner's lap <3");
  }
}

class Vet {
	void seeAnimal(Washable pet) {
      pet.wash();
	}

	void operate(Pet p) {
		
	}
}