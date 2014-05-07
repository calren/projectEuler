import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;


public class p42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numOfWords = 0;
	    

	}

	public static int getValue(String n) {
		int value = 0;
		for (int i = 0; i < n.length()-1; i++) {
			char currentLetter = n.charAt(i);
			value = value + (Character.getNumericValue(currentLetter) - 9);
		}
		
		return value;
	}
	
	public boolean isTriangleNumber(int n) {
		
		return Arrays.asList(getFirst30TriangleNumbers()).contains(n);
	}
	
	public static int[] getFirst30TriangleNumbers() {
		int[] results = new int[30];
		for (int i = 0; i < 30; i++) {
			results[i] = ((i+1)/2) * (i+2);
		}
		
		return results;
	}
}
