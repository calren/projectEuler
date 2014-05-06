
public class p05_SmallestMultiple {

	/**
	 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 */
	public static void main(String[] args) {
		
		for (int i = 20; i < 1000000000; i = i + 20) {
			if (i % 19 == 0 && i % 18 == 0 && i % 17 == 0 && i % 16 == 0 && i % 15 == 0 && i % 14 == 0 &&
					i % 13 == 0 && i % 12 == 0 && i % 11 == 0 && i % 7 == 0) {
				System.out.println(i);
				break;
			}

		}
	}

}
