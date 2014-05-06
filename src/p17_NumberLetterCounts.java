
public class p17_NumberLetterCounts {
    /*
     * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words
     * how many letters would be used?
     */
    public static void main(String[] args) {
        
        System.out.println(singleDigit() + tens() + (doubleDigit() * 9) + (singleDigit() * 9 * 9)
                + (singleDigit() * 100) + (7*900) + (3*891) 
                + ((singleDigit() + tens() + (doubleDigit() * 9) + (singleDigit() * 9 * 9)) * 9)
                + 11);
        
        
    }
    
    public static int singleDigit() {
        String s = "one" + "two" + "three" + "four" + "five" + "six" + "seven" + "eight" + "nine";
        return s.length();
    }
    
    public static int doubleDigit() {
        String s = "twenty" + "thirty" + "fourty" + "fifty" + "sixty" + "seventy" + "eighty" + "ninety";
        return s.length();
    }
    
    public static int tens() {
        String s = "ten" + "eleven" + "twelve" + "thirteen" + "fourteen" + "fifteen" + "sixteen" + "seventeen"
                + "eighteen" + "nineteen";
        return s.length();
    }

}
