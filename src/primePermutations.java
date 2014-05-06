import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class primePermutations {

	/**
	 * The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330, 
	 * is unusual in two ways: (i) each of the three terms are prime, 
	 * and, (ii) each of the 4-digit numbers are permutations of one another.
	 * 
	 * What 12-digit number do you form by concatenating the three terms in this sequence?
	 */
    
	public static void main(String[] args) {
	    ArrayList<Integer> primes = getFourDigitPrimes();
	    int[] ret = new int[3];
	    for (int j = 0 ; j < primes.size(); j++) {
	        int num = primes.get(j);
	        ret[0] = num;
	        
	        for (int i = j+1; i < primes.size(); i++) {
	            if (isPermutation(num, primes.get(i))) {
	                ret[1] = primes.get(i);
	                for (int k = i + 1; k < primes.size(); k++) {
	                    if (isPermutation(num, primes.get(k))) {
	                        ret[2] = primes.get(k);
	                        if (ret[2] - ret[1] == ret[1] - ret[0]) {
	                            System.out.println(ret[0]);
	                            System.out.println(ret[1]);
	                            System.out.println(ret[2]);
	                        }
	                    }
	                }
	            }
	        }

	    }
	    	    
	}
	
	public static boolean isPermutation(int n, int j) {
	    
	    boolean[] num1 = new boolean[10];
	    boolean[] num2 = new boolean[10];
	    
		String numN = Integer.toString(n);
		String numJ = Integer.toString(j);
		
		for (int i = 0; i < 4; i++) {
		    num1[Integer.parseInt(Character.toString(numN.charAt(i)))] = true;
		    num2[Integer.parseInt(Character.toString(numJ.charAt(i)))] = true;
		}

		return Arrays.equals(num1, num2);
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
	
	public static boolean isPrime(int n) {
		for (int i = 2; i < n/2 - 1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
