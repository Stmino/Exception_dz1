package s1_exception;

import java.util.Random;

public class GenerateArray {
	public int [] generateArray() {
		Random random = new Random();
		int [] arr = new int[random.nextInt(2) + 3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10);
		}
		return arr;
	}
}