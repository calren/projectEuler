
public class p40 {
    
    /**
     * 
     */
    public static void main(String[] args) { 
    	
    	System.out.println(getBigNumber(1));
    	System.out.println(getBigNumber(10));
    	System.out.println(getBigNumber(100));
    	System.out.println(getBigNumber(1000));
    	System.out.println(getBigNumber(10000));
    	System.out.println(getBigNumber(100000));
    }

    public static char getBigNumber(int digits) {
        String s = "";
        int startNumber = 0;
        
        while (s.length() <= digits) {
            s = s + (startNumber + 1);
            startNumber++;
        }
        
        return s.charAt(digits-1);
    }
}
