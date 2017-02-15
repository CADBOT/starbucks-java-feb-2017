package inher;

interface Washable {
   public abstract String wash();	
}

public abstract class Pet {
   String secret;
   String color;
   String breed;
   public int age;
   
   public Pet(String color, String breed, int age) {
	   this.secret = "suprise";
	   this.color = color;
	   this.breed = breed;
	   this.age = age;
   }
   
   /* tech one
   public String wash () {
	  return "I am clean. Yea!"; 
   }
   */
   
   public abstract String demandFood();
   public abstract String demandFood(String treat);
   
   public double takeToVet(double ownersMoney) {
	   takeForWalk();
	   return ownersMoney - 20;
   }
   
   public void takeForWalk() {
	   
   }
}

class Cat extends Pet {
   String favoriteNapSpot;

   public Cat(String color, String breed, int age, String favoriteNapSpot) {
     super(color, breed, age);	   
     this.favoriteNapSpot = favoriteNapSpot;
   }

@Override
public String demandFood() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String demandFood(String treat) {
	// TODO Auto-generated method stub
	return null;
}

/*
@Override
public String wash() {
	// TODO Auto-generated method stub
	return "Hiss *scratch face and runs away*";
}
*/
   
  	
}

class Dog extends Pet implements Washable {
   String favoriteBone;
   boolean purpleTongue;
   String barkSound;
   
   public Dog(String color, String breed, int age, String favoriteBone, boolean purlpleTongue, String barkSound) {
     super(color, breed, age);	   
     this.favoriteBone = favoriteBone;
     this.purpleTongue = purpleTongue;
     this.barkSound = barkSound;
   }
   
   public double takeToVet(double ownersMoney) {
	   super.takeForWalk();
	   return ownersMoney - 100;
   }
   
   public void fetch() {
	   String s = secret;
	   System.out.println("Go get it!");
	   System.out.println("Threw the " + favoriteBone);
	   String petColor = super.color;
   }

	@Override
	public String demandFood(String treat) {
		return "woof woof " + treat + " please";
	}

	@Override
	public String demandFood() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String wash() {
		// TODO Auto-generated method stub
		return "woof woof I love baths";
	}
}

