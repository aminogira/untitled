import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class HRThree {




    public static int minimumDistances(List<Integer> a) {
        int ans=-1;
        int distance=99999999;
        LinkedList<Integer> al=new LinkedList<Integer>(a);
        for(int x=0;x<al.size();x++){
            int num=al.get(x);
            for (int y = x+1; y < al.size(); y++) {
                if(num == al.get(y)){
                    if(y-x<distance)distance=y-x;
                }
            }
        }
        if(distance!=99999999)
            ans=distance;
        return ans;
    }


//    public static List<Integer> acmTeam(List<String> topic) {
//        // Write your code here
//
//
//
//    }

    public static int equalizeArray(List<Integer> arr) {
        List<Integer> distinctInts=arr.stream().distinct().collect(Collectors.toList());
        int maxfreq=0;
        for(int i=0;i<distinctInts.size();i++)
        {
            int freq=Collections.frequency(arr, distinctInts.get(i));
            if(freq>maxfreq)
                maxfreq=freq;
        }
        return arr.size()-maxfreq;
    }


    public static int equalizeArrayOld(List<Integer> arr) {
        int ans=0;
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            int a=arr.get(i);
            if(i+1< arr.size() && ( a==arr.get(i+1))){
                while( i+1<= arr.size() && (a==arr.get(i)) ){
                    arr.remove(i);
                }
                i=-1;
            }
        }
        System.out.println(arr);
        return arr.size();
    }

    public static long repeatedString(String s, long n) {
        long l=s.length();
        long count = s.chars().filter(ch -> ch == 'a').count();
        long nDup= (long) Math.floor(n/l);
        int nRest = (int) (n % l);
        long countRest = s.substring(0,nRest).chars().filter(ch -> ch == 'a').count();
        return count*nDup + countRest;
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int ans=0;
        LinkedList<Integer> ll=new LinkedList(c);
        for(int i=1;i<ll.size();i++){
            if(i+1<ll.size() && ( ll.get(i+1)==0)){
                i++;
            }
            ans++;
        }
        return ans;
    }

    static int jumpingOnClouds(int[] c, int k) {
        int energy=100;
        int i = 0;
        do{
            i = (i + k) % c.length ;
            energy--;
            if(c[i]==1)energy-=2;
        }while(i !=0);
        return energy;
    }


    static int jumpingOnClouds2(int[] c, int k) {

        int energy =100;
        int index=0;
        do
        {
            index = (index+k) % c.length;
            energy-=1;

            if(c[index] == 1)
            {
                energy-=2;
            }
        }
        while(index!=0);

        return energy;
    }


}
