import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;

public class ThreeNumSumTest {
    @Test
    public void canary() {
        Assert.assertTrue(true);
    }
    @Test
    public void Test1(){
        ArrayList<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[]{1,2,3});
        Assert.assertArrayEquals(ThreeNumSum.threeNumberSum(new int[]{1,2,3},12));
    }
}
