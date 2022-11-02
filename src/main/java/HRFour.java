import java.util.List;

public class HRFour {

    static int flatlandSpaceStations(int n, int[] c) {
        int ans=0;
        for(int i=0;i<n;i++){
            int min=999999999;
            for(int j:c){
                int d=Math.abs(i-j);
                if(d<min)min=d;
            }
            if(min>ans)ans=min;
        }
        return ans;
    }




    public static int workbook(int n, int k, List<Integer> arr) {
        int ans=0;
        int ar[]=arr.stream().mapToInt(z->z).toArray();
        int page=1;
        for(int c=0;c<ar.length;c++){
            int probInPage=0;
            for(int p=1;p<=ar[c];p++){
                probInPage++;
                if(probInPage>k){
                    page++;
                    probInPage=1;
                }
                if(page==p){
                    ans++;
                }
            }
            page++;
        }
        return ans;
    }

    public static int workbookOrigi(int n, int k, List<Integer> arr) {
        int ans=0;
        int ar[]=arr.stream().mapToInt(z->z).toArray();
        int page=1;
        for(int c=0;c<ar.length;c++){
            int probInPage=0;
            for(int p=1;p<=ar[c];p++){
                probInPage++;
                if(probInPage>k){
                    page++;
                    System.out.println("-------------");
                    probInPage=1;
                }
                if(page==p){
                    ans++;
                }
                System.out.print(  "\t" + c + "::" + p + "(" + page + ")");
            }
            page++;
            System.out.println("==============");
        }
        return ans;
    }


    public static int beautifulTriplets(int d, List<Integer> arr) {
        int ans=0;
        int ar[]=arr.stream().mapToInt(k->k).toArray();
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length-1;j++){
                if(ar[j]-ar[i]==d){
                    for(int k=j+1;k<ar.length;k++){
                        if(ar[k]-ar[j]==d)ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static int howManyGames(int p, int d, int m, int s) {
        int ans=0;
        int price=p;
        while (price<=s){
            s-=price;
            ans++;
            if((price-d)>m)price-=d;
            else price=m;
        }
        return ans;
    }

    public static void kaprekarNumbers(int p, int q) {
        boolean isNotFound=true;
        for(int i=p;i<=q;i++){
            long pow = (long) Math.pow(i,2);
            String sPow=String.valueOf(pow);
            String sI=String.valueOf(i);
            int d=sI.length();
            String a=sPow.substring(0,sPow.length()-d);
            String b=sPow.substring(sPow.length()-d);
            int ia=0; int ib=0;
            if(a.length()>0) ia = Integer.parseInt(a);
            if(b.length()>0) ib = Integer.parseInt(b);
            if (ia + ib == i) {
                System.out.print(i + " ");
                isNotFound=false;
            }
        }
        if(isNotFound)System.out.print("INVALID RANGE");
    }

    public static void kaprekarNumbersOld(int p, int q) {

            boolean isNotFound = true;

            for (int i = p; i <= q; i++) {
                long pow = (long) Math.pow(i,2);
                String sPow = String.valueOf(pow);
                String sI = String.valueOf(i);
                int d = sI.length();
                String a="";
                String b="";
                try {
                 a = sPow.substring(0, sPow.length() - d);
                 b = sPow.substring(sPow.length() - d);
                }catch (Exception e){
                    System.out.println(e);
                    System.out.println(i + " >> " + sPow + " :: " + sI + " :: " + a + " :: " + b);
                }
                int ia = 0;
                int ib = 0;
                if (a.length() > 0) ia = Integer.parseInt(a);
                if (b.length() > 0) ib = Integer.parseInt(b);
                if (ia + ib == i) {
                    System.out.print(i + " ");
                    isNotFound = false;
                }
            }
            if(isNotFound)System.out.print("INVALID RANGE");



    }

    public static int chocolateFeast(int n, int c, int m) {
        int totChockBar=0;
        int initBar= (int) Math.floor(n/c);
        totChockBar = initBar;
        int nWap=initBar;
        while(nWap>=m){
            int nFreeBar= (int) Math.floor(nWap/m);
            totChockBar += nFreeBar;
            nWap=nWap%m + nFreeBar;
        }
        return totChockBar;
    }



    public static String timeInWords(int h, int m) {
        String word="";
        String[] numNames = {
            "", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine",
            " ten", " eleven", " twelve", " thirteen", " fourteen", " quarter", " sixteen", " seventeen", " eighteen", " nineteen",
            " twenty ", " twenty one", " twenty two", " twenty three", " twenty four", " twenty five", " twenty six", " twenty seven", " twenty eight", " twenty nine", " half"
        };
        if (m == 0){
            word = numNames[h] + " o' clock";
        }else if(m <=30) {
            if(m==15 ||m==30) {
                word = numNames[m] + " past" + numNames[h];
            }else if(m==1){
                word = numNames[m] + " minute past" + numNames[h];
            }else{
                word = numNames[m] + " minutes past" + numNames[h];
            }
        }else{
            m=60-m;
            h++;
            if(m==15 ) {
                word = numNames[m] + " to" + numNames[h];
            }else if(m==1){
                word = numNames[m] + " minute to" + numNames[h];
            }else{
                word = numNames[m] + " minutes to" + numNames[h];
            }
        }
        return word.trim();
    }
}
