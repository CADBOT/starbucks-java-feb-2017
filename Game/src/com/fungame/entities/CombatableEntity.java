package com.fungame.entities;

import java.lang.Math;
//import com.fungame.interfaces.Combatable;
//import com.fungame.interfaces.SomeClass;
import com.fungame.interfaces.*;
/*
*/
//import com.fungame.interfaces.*;
import com.fungame.interfaces.moreinterfaces.*;
//import com.fungame.interfaces.moreinterfaces.YetAnotherClass;
//import com.fungame.interfaces.moreinterfaces.YetAnotherInterface;

class YetYetAnotherClass extends YetAnotherClass implements YetAnotherInterface{}

class A extends SomeClass {}


public abstract class CombatableEntity extends Entity implements Combatable{
	  int attackPower;

	  public void attack(CombatableEntity e) {
		  double y = Math.PI;
		  double x = Math.random();
		  System.out.println(name + " is attacking " + e.getName());
		  e.receiveDamage(attackPower);
	  }
	  
	  public void receiveDamage(int damage) {
		  health -= damage;
		  
		  int x = 4;
		  while (x < 4) {
			  // do stuff
		  }
		  
		  for (int x = 0; x < 4; x ++) {
			  // do stuff
		  }
	  }
}
