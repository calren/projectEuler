
public class p40 {
    
    /**
     * 
     */
    public static void main(String[] args) { 
        System.out.println(getBigNumber(1) * getBigNumber(10) * getBigNumber(100) * getBigNumber(1000) 
                * getBigNumber(10000));
        
//         * getBigNumber(100000) * getBigNumber(1000000)
    }

    public static int getBigNumber(int digits) {
        String s = "";
        int startNumber = 1;
        
        while (s.length() < digits) {
            s = s + (startNumber + 1);
            startNumber++;
        }
        
        System.out.println(startNumber);
        
        return (int) s.charAt(s.length()-1);
    }
}
