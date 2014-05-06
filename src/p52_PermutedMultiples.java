import java.util.Arrays;


public class p52_PermutedMultiples {
    /*
     * Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
     */
    
    public static void main(String[] args) {
        for (int i = 1; i < 1000000; i++) {
            if (sameDigits(i, i * 2)) {
                if (sameDigits(i, i * 3)) {
                    if (sameDigits(i, i * 4)) {
                        if (sameDigits(i, i * 5)) {
                            if (sameDigits(i, i*6)) {
                                System.out.println(i);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static boolean sameDigits(int n, int j) {
        boolean[] num1 = new boolean[10];
        boolean[] num2 = new boolean[10];
        
        String numN = Integer.toString(n);
        String numJ = Integer.toString(j);
        
        if (numN.length() != numJ.length()) {
            return false;
        }
        
        for (int i = 0; i < numJ.length(); i++) {
            num1[Integer.parseInt(Character.toString(numN.charAt(i)))] = true;
            num2[Integer.parseInt(Character.toString(numJ.charAt(i)))] = true;
        }

        return Arrays.equals(num1, num2);
    }

}
