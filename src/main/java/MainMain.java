public class MainMain {
    public static void main(String args[]){
        System.out.println("test test success");

        int expected = 13;
        int ans = saveThePrisoner(13, 140874526, 1);
        if(ans == expected){
            System.out.println("Pass");
        }else{
            System.out.println("Expected:" + expected + "\t Found:" + ans );
        }
    }

    public static int saveThePrisoner(int nPris, int nCandy, int start) {
        nCandy=nCandy%nPris;
        if(nCandy==0) nCandy = nPris;
        nCandy--;
        int endChair=0;
        if(nCandy+start<=nPris){
            endChair=nCandy+start;
        }else{
            endChair=nCandy+start-nPris;
        }

        return endChair;
    }
}
