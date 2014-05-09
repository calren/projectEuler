import java.util.ArrayList;
import java.util.Hashtable;


public class p23 {
    
    public static void main(String[] args) { 
        Hashtable<Integer, Integer> h = getAllAbundants(); 
        ArrayList<Integer> a = getAllAbundantsArray();
        int totalSum = 0;
        for (int i = 24; i <= 28123; i++) {
            outerloop:
            for (int j : a) {
                if (h.get(i-j) != null && h.get(i-j) > 0) {
                    break outerloop;
                }
                System.out.println(i);
                totalSum = totalSum + i;
            }
        }
        
        System.out.println(totalSum);
        
    }
    
    public static Hashtable<Integer, Integer> getAllAbundants() {
        Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
        for (int i = 12; i < 28123; i++) {
            if (isAbundant(i)) {
                h.put(i, i);
            }
        }
        
        return h;
    }
    
    public static ArrayList<Integer> getAllAbundantsArray() {
        ArrayList<Integer> abundants = new ArrayList<Integer>();
        for (int i = 12; i < 28123; i++) {
            if (isAbundant(i)) {
                abundants.add(i);
            }
        }
        
        return abundants;
    }
    
    public static boolean isAbundant(int i) {
        ArrayList<Integer> factors = getFactors(i);
        int sumOfFactors = 0;
        for (int num : factors) {
            sumOfFactors = sumOfFactors + num;
        }
        
        return sumOfFactors > i;
    }
    
    public static ArrayList<Integer> getFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i < num/2 + 1 ; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }
                
        return factors;
    }

}
