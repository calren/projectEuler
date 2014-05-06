import java.lang.reflect.Array;
import java.util.ArrayList;


public class primePermutations {

	/**
	 * The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330, 
	 * is unusual in two ways: (i) each of the three terms are prime, 
	 * and, (ii) each of the 4-digit numbers are permutations of one another.
	 * 
	 * What 12-digit number do you form by concatenating the three terms in this sequence?
	 */
	public static void main(String[] args) {
		ArrayList<Integer> uniquePrimes = getAllUniqueFourDigitPrimes();
		
		for (int i = 0; i < uniquePrimes.size(); i++) {
			int currentPrime = uniquePrimes.get(i);
		
			for (int j = 1 +1; j < i ; j++) {
				if (isPalindrome(currentPrime, uniquePrimes.get(j))) {
					System.out.println(currentPrime);
					System.out.println(uniquePrimes.get(j));
				}
			}
		}
	}
	
	public static boolean isPalindrome(int n, int j) {
		String num1 = Integer.toString(n);
		String num2 = Integer.toString(j);
		if ( 	num2.contains(Character.toString(num1.charAt(0)))
				&& num2.contains(Character.toString(num1.charAt(1)))
				&& num2.contains(Character.toString(num1.charAt(2)))
				&& num2.contains(Character.toString(num1.charAt(3)))
				) {
			return true;
		}
		return false;
	}
	
	public static ArrayList<Integer> getAllUniqueFourDigitPrimes() {
		ArrayList<Integer> primes = getFourDigitPrimes();
		ArrayList<Integer> uniquePrimes = new ArrayList<Integer>();
		for (int i : primes) {
			if (isUnique(i)) {
				uniquePrimes.add(i);
			}
		}
		return uniquePrimes;
	}
	
	public static ArrayList<Integer> getFourDigitPrimes() {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = 1000; i < 10000; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		
		return primes;
	}

	public static boolean isUnique(int n) {
		String s = Integer.toString(n);
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i+1).contains(Character.toString(s.charAt(i)))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i < n/2 - 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
