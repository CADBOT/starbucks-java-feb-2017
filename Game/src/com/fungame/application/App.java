package com.fungame.application;

import java.util.*;

class SomeClass<T> {
  public T[] innerCollection;
  public SomeClass() {
  }

  static void doStuff(String msg) {
	  System.out.println(msg);
	  System.out.println("Do stuff method called");
  }
  
  void someInstanceMethod() {
	  System.out.println("called");
  }
}

class YetAnotherClass extends SomeClass{}

public class App {
  public static void main(String[] args) {
	  SomeClass<String> myClass = new SomeClass<String>();
	  SomeClass<Integer> myClassTwo = new SomeClass<>();
	  System.out.println(myClass.innerCollection);
	  System.out.println(myClassTwo.innerCollection);
	  /*
	  Map myMap = new HashMap();
	  myMap.put("Charlie", "Crawford");
	  myMap.put("Bob", "Dylan");
	  System.out.println(myMap);
	  String LastName = (String) myMap.get("Bob");
	  myMap.put("Bob", "New last name");
	  System.out.println(myMap);
	  System.out.println(myMap.get("hello"));
	  */
	  //Set mySet = new HashSet();
	  List<Integer> myList = new ArrayList<Integer>();
	  myList.add(2);
	  int x = myList.get(0);
	  //myList.add("hello");
	  // mylist.add(2);
	  /*
	  myList.add(2);
	  myList.add(4);
	  myList.add(6);
      SomeClass x = new SomeClass(); 
      x.doStuff();
	  myList.add(x);
	  System.out.println(myList);
	  int a = (int) myList.get(0);
	  Object b = myList.get(0);
	  Object c = myList.get(0);
	  Object d = myList.get(3);
	  System.out.println(x == d);
	  System.out.println(x);
	  System.out.println(d);
	  */
	  /*
	  for (Object obj : myList) {
	    System.out.println(obj); 
	  }
	  */
  }
}
