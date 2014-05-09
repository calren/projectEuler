
public class p07 {
    public static void main(String[] args) { 
        int currentPrimeCount = 0;
        int firstPrime = 2;
        
        for (firstPrime = 2; currentPrimeCount < 10001; firstPrime++) {
            if (isPrime(firstPrime)) {
                currentPrimeCount++;
                System.out.println(firstPrime);
            }
        }
        
    }
    
    public static boolean isPrime(int n) {
        for (int i = 2; i < n/2 + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
