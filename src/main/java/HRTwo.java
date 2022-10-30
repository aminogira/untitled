import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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

    public static String appendAndDelete(String s, String t, int k) {
        char[] ss,tt;
        ss=s.toCharArray();
        tt=t.toCharArray();
        boolean isCountStartDelete=false;
        boolean isCountStartAppend=false;

        int nDelete=0;
        int nAppend=0;
        //int fullTotCount=0;
        int nMax=ss.length;
        int fullTotCount= nMax+tt.length;
        if (tt.length>nMax) nMax=tt.length;
        if(fullTotCount<=k){
            return "Yes";
        }else {
            for (int i = 0; i < nMax; i++) {
                if (tt.length > i && ss.length > i) {
                    if (ss[i] != tt[i]) {
                        isCountStartDelete = true;
                        isCountStartAppend = true;
                    }
                } else {
                    isCountStartDelete = true;
                    isCountStartAppend = true;
                }
                if (isCountStartDelete && i < ss.length) {
                    nDelete++;
                }
                if (isCountStartAppend && i < tt.length) {
                    nAppend++;
                }
            }
            System.out.println(nDelete + " :: " + nAppend);
            if (nDelete + nAppend == k) {
                return "Yes";
            }else if (nDelete + nAppend < k) {
                int dif= k - nDelete - nAppend;
                if(dif%2==0) return "Yes";
                else return "No";
            } else {
                return "No";
            }
        }
    }


    public static int squares(int a, int b) {
        int ans=0;
        double sqr=Math.sqrt(a);
        int start= (int) Math.ceil(sqr);
        boolean isInRange=true;
        while(isInRange){
            int power = start*start;
            if(power>=a && power<=b){
                ans++;
            }else{
                isInRange=false;
            }
            start++;
        }
        return ans;
    }


    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int ans=0;

        if(y1==y2 && m1==m2 && d1>d2){
            int nDays=d1-d2;
            ans = nDays*15;
        }else if(y1==y2 && m1>m2){
            int nMonth = m1 - m2;
            ans = nMonth * 500;
        }else if(y1>y2) {
            ans = 10000;
        }
        return ans;
    }


    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List out=new LinkedList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>(arr);
        Collections.sort(ll);
        while(ll.size()>0){
            int nCut=0;
            int min=ll.get(0);
            for (int i = 0; i < ll.size(); i++) {
                int len=ll.get(i);
                if(len>min){
                    len = len -min;
                    ll.remove(i);
                    ll.add(i,len);
                    nCut++;
                }else{
                    ll.remove(i);
                    i--;
                    nCut++;
                }
            }
            out.add(nCut);
        }
        return out;
    }




}
