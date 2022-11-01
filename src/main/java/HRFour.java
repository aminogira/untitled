public class HRFour {

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
