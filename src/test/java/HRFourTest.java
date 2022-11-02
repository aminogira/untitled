import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class HRFourTest {


    @Test
    public void testflatlandSpaceStations01() {
        int[] input = {0,4 };
        int ans=HRFour.flatlandSpaceStations(5,input);
        assertEquals(2,ans);
    }

    @Test
    public void testflatlandSpaceStations02() {
        int[] input = {0,1,2,3,4,5 };
        int ans=HRFour.flatlandSpaceStations(5,input);
        assertEquals(0,ans);
    }

    @Test
    public void testworkbook01() {
        int[] input = {4,2 };
        List<Integer> in = Arrays.stream(input).boxed().collect(Collectors.toList());
        int ans=HRFour.workbook(10,3,in);
        assertEquals(1,ans);
    }

    @Test
    public void testworkbook02() {
        int[] input = {4,2,6,1,10 };
        List<Integer> in = Arrays.stream(input).boxed().collect(Collectors.toList());
        int ans=HRFour.workbook(5,3,in);
        assertEquals(4,ans);
    }

    @Test
    public void testbeautifulTriplets01() {
        int[] input = {1, 2, 4, 5 ,7, 8, 10 };
        List<Integer> in = Arrays.stream(input).boxed().collect(Collectors.toList());
        int ans=HRFour.beautifulTriplets(3,in);
        assertEquals(3,ans);
    }

    @Test
    public void testbeautifulTriplets02() {
        int[] input = {2,2,3,4,5 };
        List<Integer> in = Arrays.stream(input).boxed().collect(Collectors.toList());
        int ans=HRFour.beautifulTriplets(1,in);
        assertEquals(3,ans);
    }

    @Test
    public void testhowManyGames01() {
        int ans=HRFour.howManyGames(20,3,6,70);
        assertEquals(5,ans);
    }
    @Test
    public void testhowManyGames02() {
        int ans=HRFour.howManyGames(20,3,6,80);
        assertEquals(6,ans);
    }
    @Test
    public void testhowManyGames03() {
        int ans=HRFour.howManyGames(20,3,6,85);
        assertEquals(7,ans);
    }

    @Test
    public void testkaprekarNumbers01() {
        HRFour.kaprekarNumbers(1,100);
        System.out.println();
        //assertEquals(true,ans);
    }
    @Test
    public void testkaprekarNumbers03() {
        HRFour.kaprekarNumbers(1,99999);
        System.out.println();
        //assertEquals(true,ans);
    }

    @Test
    public void testkaprekarNumbers04() {
        HRFour.kaprekarNumbers(22222,99999);
        System.out.println();
        //assertEquals(true,ans);
    }

    @Test
    public void testkaprekarNumbers02() {
        HRFour.kaprekarNumbers(10,40);
        System.out.println();
        //assertEquals(true,ans);
    }

    @Test
    public void testchocolateFeast01() {
        int ans=HRFour.chocolateFeast(10,2,5);
        assertEquals(6,ans);
    }
    @Test
    public void testchocolateFeast02() {
        int ans=HRFour.chocolateFeast(12,4,4);
        assertEquals(3,ans);
    }
    @Test
    public void testchocolateFeast03() {
        int ans=HRFour.chocolateFeast(6,2,2);
        assertEquals(5,ans);
    }

    @Test
    public void testtimeInWords01() {
        String ans=HRFour.timeInWords(5,47);
        String exp="thirteen minutes to six";
        assertEquals(exp,ans);
    }

    @Test
    public void testtimeInWords02() {
        String ans=HRFour.timeInWords(3,00);
        String exp="three o' clock";
        assertEquals(exp,ans);
    }

    @Test
    public void testtimeInWords03() {
        String ans=HRFour.timeInWords(7,15);
        String exp="quarter past seven";
        assertEquals(exp,ans);
    }
    @Test
    public void testtimeInWords04() {
        String ans=HRFour.timeInWords(1,1);
        String exp="one minute past one";
        assertEquals(exp,ans);
    }
}