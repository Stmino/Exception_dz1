package s1_exception;

public class ProcessArray {
	public int[] arraysDifference(int[] arr1, int[] arr2) {
		if (arr1 == null || arr2 == null) {
			throw new NullPointerException("OK");
		}
		if (arr1.length != arr2.length) {
			throw new CustomArraySizeException("Ошибка", arr1.length, arr2.length);
		}
		int[] result = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i] - arr2[i];
		}
		return result;
	}

	class CustomArraySizeException extends RuntimeException {

		int length1;
		int length2;

		public int getLength1() {
			return length1;
		}

		public int getLength2() {
			return length2;
		}

		public CustomArraySizeException(String message, int length1, int length2) {
			super(message);
			this.length1 = length1;
			this.length2 = length2;
		}
	}
}