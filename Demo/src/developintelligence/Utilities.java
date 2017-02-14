package developintelligence;

public class Utilities {
  public static int x = 4;
  public static void someFunction() {
     int x = 10;
     int z;
	 if (true) {
		 z = 20;
		 System.out.println(z);
	 }
	 System.out.println(z);
  }

  static int doTwoOperations(int x, int y) {
	  int z = add(2, 4);
	  return sub(z, 10);
  }
  public static int add(int x, int y) {
	return x + y;
  }
  static int sub(int x, int y) {
	return x - y;
  }
}
