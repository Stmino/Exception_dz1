package s1_exception;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 * и возвращающий новый массив, каждый элемент которого равен разности элементов
 * двух входящих массивов в той же ячейке. Если длины массивов не равны,
 * необходимо как-то оповестить пользователя.
 */
public class s1_3 {
	public static void main(String[] args) {
		dz1();
	
	}

	static void dz1(){
		try {
			int [] arr1 = new GenerateArray().generateArray();
			int [] arr2 = new GenerateArray().generateArray();
			int [] result = new ProcessArray().arraysDifference(arr1, arr2);
			for (int a1 : arr1) System.out.printf("%d\t", a1);
			System.out.println();
			for (int a2 : arr2) System.out.printf("%d\t", a2);
			System.out.println();
			System.out.println("Разница элементов двух массивов:");
			for (int i : result) System.out.printf("%d\t", i);
		} catch (ProcessArray.CustomArraySizeException e) {
			System.out.println(e.getMessage());
			System.out.printf(
					"Длина первого массива: %d\nДлина второго массива: %d\n",
					e.getLength1(), e.getLength2());
		}
	}
}