package intro;

public class Main {

	public static void main(String[] args) {
		// Value type
		int value1 = 10;
		int value2 = 20;
		value1 = value2;
		System.out.println(value1);

		// Reference type
		int[] values1 = { 1, 2, 3, 4, 5 };
		int[] values2 = { 10, 20, 30, 40, 50 };
		values1 = values2;
		values2[0] = 100;
		System.out.println(values1[0]);
	}

}
