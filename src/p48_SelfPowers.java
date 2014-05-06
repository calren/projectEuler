
public class p48_SelfPowers {

    /*
     * Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
     */
    
    public static void main(String[] args) {
        int num = 1000;
        for (int i = 1; i < 10; i++) {
            num = num * num;
        }
        System.out.println(num);
    }
}
