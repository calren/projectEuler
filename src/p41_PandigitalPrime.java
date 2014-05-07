
public class p41_PandigitalPrime {
    
    /**
     * What is the largest n-digit pandigital prime that exists?
     */
    public static void main(String[] args) { 
        
        for (int i = 2142; i < 999999999; i++) {
            if (isPandigital(i)) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
        
    }
    
    public static boolean isPandigital(int n) {
        String num = Integer.toString(n);
        for (int i = 1; i <= num.length(); i++) {
            if (!num.contains(Integer.toString(i))) {
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
