import org.junit.jupiter.api.Test;

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



}