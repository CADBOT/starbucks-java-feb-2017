import developintelligence.Utilities;

public class Demo {
  public static void main(String[] args) {
	  Utilities.someFunction();
	  /*
	  Utilities.add(2, 4);
	  for (int i = 0; i < 10; i++) {
		 if (i == 5) {
			 continue;
		 }
		 System.out.println(i);
	  }
	  */
  }
  
  public static void addToAll(int[] arr, int value)  {
	 for (int i = 0; i < arr.length; i++) {
	   arr[i] = arr[i] + value;
	 }
  }
  
  public static int[] randomArray(int size) {
	 int[] myArray = new int[size]; 
	 for (int i = 0; i < myArray.length; i++) {
	   myArray[i] = (int) (Math.random() * 5000 + 1);
	 }
	 return myArray;
  }
}
