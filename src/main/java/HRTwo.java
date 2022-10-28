import java.math.BigInteger;

public class HRTwo {
    public static int findDigits(int n) {
        int ans=0;
        String sN=String.valueOf(n);
        char cN[]= sN.toCharArray();
        for(int i=0;i<cN.length;i++){
            int d=   Character.getNumericValue(cN[i]);
                if (d>0 && (n % d == 0)) {
                    ans++;
                }
        }
        return ans;
    }

    public static void extraLongFactorials(int n) {
        BigInteger bi=new BigInteger(String.valueOf(n));
        n--;
        for(; n>1; --n){
            BigInteger bi2=new BigInteger(String.valueOf(n));
            bi = bi.multiply(bi2);
        }
        System.out.println(bi);
    }

}
