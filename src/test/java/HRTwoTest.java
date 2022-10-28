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


}