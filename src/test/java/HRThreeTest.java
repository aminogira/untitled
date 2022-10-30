import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class HRThreeTest {


    @Test
    public void testequalizeArray01() {

        int input[]= {3, 3, 2 ,1 ,3};
        List<Integer> in = Arrays.stream(input).boxed().collect(Collectors.toList());
        int ans= HRThree.equalizeArray(in);
        assertEquals(2,ans);
    }


    @Test
    public void testrepeatedString01() {
        long ans= HRThree.repeatedString("aba", 10);
        assertEquals(7,ans);
    }

    @Test
    public void testrepeatedString02() {
        long ans= HRThree.repeatedString("a", 1000000000000L);
        assertEquals(1000000000000L,ans);
    }



    @Test
    public void testjumpingOnCloudsGame01() {
        int input[]= {0, 0, 1, 0, 0, 1, 0};
        List<Integer> in = Arrays.stream(input).boxed().collect(Collectors.toList());
        int ans= HRThree.jumpingOnClouds(in);
        assertEquals(4,ans);
    }
    @Test
    public void testjumpingOnCloudsGame02() {
        int input[]= {0, 0, 0, 0, 1, 0};
        List<Integer> in = Arrays.stream(input).boxed().collect(Collectors.toList());
        int ans= HRThree.jumpingOnClouds(in);
        assertEquals(3,ans);
    }

    @Test
    public void testjumpingOnCloudsGame03() {
        int input[]= {0,1,0,0,0,1,0};
        List<Integer> in = Arrays.stream(input).boxed().collect(Collectors.toList());
        int ans= HRThree.jumpingOnClouds(in);
        assertEquals(3,ans);
    }


    @Test
    public void testjumpingOnCloudsGame04() {
        int input[]= {0, 0, 0, 1, 0, 0};
        List<Integer> in = Arrays.stream(input).boxed().collect(Collectors.toList());
        int ans= HRThree.jumpingOnClouds(in);
        assertEquals(3,ans);
    }

    @Test
    public void testjumpingOnClouds01() {
        int c[]={0, 0, 1, 0, 0, 1, 1, 0};
        int ans= HRThree.jumpingOnClouds(c, 2);
        assertEquals(92,ans);
    }

    @Test
    public void testjumpingOnClouds02() {
        int c[]={1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        int ans= HRThree.jumpingOnClouds(c, 3);
        assertEquals(80,ans);
    }

    @Test
    public void testjumpingOnClouds03() {
        int c[]={0,0,1,0};
        int ans= HRThree.jumpingOnClouds(c, 2);
        assertEquals(96,ans);
    }


}