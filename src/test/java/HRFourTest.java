import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HRFourTest {
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