package week1.day6.assignment1;

public class ArrayMain {

	public static void main(String[] args) {
		int[] theArray = new int[10];
		
		for (int i = 1; i <= theArray.length; i++)
			theArray[i - 1] = i;
		
		for (int i : theArray)
			if (i % 2 == 0)
				System.out.println(i);
	}
}
