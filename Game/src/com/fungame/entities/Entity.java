package com.fungame.entities;

abstract class Entity {
  String name;
  int health;
  
  public String getName() {
	  return name;
  }

  public String getStats() {
	  return name + " " + health;
  }
}
