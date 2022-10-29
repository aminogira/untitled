import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


import static org.junit.jupiter.api.Assertions.*;

class HRTwoTest {
    @Test
    public void testFindDigits01() {
        int n=124;
        int ans=HRTwo.findDigits(n);
        assertEquals(3,ans);
    }
    @Test
    public void testFindDigits02() {
        int n=111;
        int ans=HRTwo.findDigits(n);
        assertEquals(3,ans);
    }
    @Test
    public void testFindDigits03() {
        int n=10;
        int ans=HRTwo.findDigits(n);
        assertEquals(1,ans);
    }

    @Test
    public void testExtraLongFactorials01() {
        int n=30;
        HRTwo.extraLongFactorials(n);
    }

    @Test
    public void testappendAndDelete01() {

        String ans= HRTwo.appendAndDelete("hackerhappy", "hackerrank", 9);
        assertEquals("Yes",ans);
    }
    @Test
    public void testappendAndDelete02() {

        String ans= HRTwo.appendAndDelete("aba", "aba", 7);
        assertEquals("Yes",ans);
    }
    @Test
    public void testappendAndDelete03() {

        String ans= HRTwo.appendAndDelete("ashley", "ash", 2);
        assertEquals("No",ans);
    }
    @Test
    public void testappendAndDelete04() {
        String ans= HRTwo.appendAndDelete("abcd", "abcdert", 10);
        assertEquals("No",ans);
    }
    @Test
    public void testappendAndDelete05() {
        String ans= HRTwo.appendAndDelete("y", "yu", 2);
        assertEquals("No",ans);
    }

    @Test
    public void testsquares01() {
        int ans= HRTwo.squares(3, 9);
        assertEquals(2,ans);
    }
    @Test
    public void testsquares02() {
        int ans= HRTwo.squares(17, 24);
        assertEquals(0,ans);
    }

    @Test
    public void testlibraryFine01() {
        int ans= HRTwo.libraryFine(14, 7, 2018, 5, 7, 2018);
        assertEquals(135,ans);
    }

    @Test
    public void testlibraryFine02() {
        int ans= HRTwo.libraryFine(28, 2, 2015, 15, 4, 2015);
        assertEquals(0,ans);
    }

    @Test
    public void testlibraryFine03() {
        int ans= HRTwo.libraryFine(2, 7, 1014, 1, 1, 1015);
        assertEquals(0,ans);
    }

    @Test
    public void testlibraryFine04() {
        int ans= HRTwo.libraryFine(15, 7, 2014, 1, 7, 2015);
        assertEquals(0,ans);
    }


    @Test
    public void testcutTheSticks01() {
        int inArr[]={5, 4, 4, 2, 2, 8};
        List<Integer> input = Arrays.stream(inArr).boxed().collect(Collectors.toList());
        System.out.println(input);
        List ans = HRTwo.cutTheSticks(input);
        int expectedArr[]={6, 4, 2, 1};
        List<Integer> expected = Arrays.stream(expectedArr).boxed().collect(Collectors.toList());
        assertTrue(expected.equals(ans));
    }

    @Test
    public void testcutTheSticks02() {
        int inArr[]={1, 2, 3, 4, 3, 3, 2, 1};
        List<Integer> input = Arrays.stream(inArr).boxed().collect(Collectors.toList());
        System.out.println(input);
        List ans = HRTwo.cutTheSticks(input);
        int expectedArr[]={8, 6, 4, 1};
        List<Integer> expected = Arrays.stream(expectedArr).boxed().collect(Collectors.toList());
        assertTrue(expected.equals(ans));
    }

}