import java.util.ArrayList;


public class p02_Evenfib {

	/**
	 * By considering the terms in the Fibonacci sequence whose values do not exceed four million
	 * find the sum of the even-valued terms
	 */
	public static void main(String[] args) {
		
		int firstNum = 1;
		int secondNum = 2;
		int oldFirstNum = 0;
		int sumOfFibs = 0;
		
		while (secondNum < 4000000) {
			if (secondNum % 2 == 0) {
				sumOfFibs = sumOfFibs + secondNum;
			}
			
			oldFirstNum = firstNum;
			firstNum = secondNum;
			secondNum = oldFirstNum + secondNum;
		}
		
		System.out.println(sumOfFibs);

	}

}
