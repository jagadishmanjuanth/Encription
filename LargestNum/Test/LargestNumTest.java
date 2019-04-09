import org.junit.Assert;
import org.junit.Test;

public class LargestNumTest {
    @Test
    public void Canary(){
        Assert.assertTrue(true);
    }
    @Test
    public void Test0(){
        int[] expected = {1,1};
        Assert.assertArrayEquals(LargestNum.largestNum(new int[] {1,1}),expected);
    }
    @Test
    public void Test1(){
        int[] expected = {1,2};
        Assert.assertArrayEquals(LargestNum.largestNum(new int[]{1,2}),expected);
    }
    @Test
    public void Test2(){
        int[] expected = {1,2};
        Assert.assertArrayEquals(LargestNum.largestNum(new int[]{1,2}),expected);
    }
    @Test
    public void Test3(){
        int[] expected = {1,4};
        Assert.assertArrayEquals(LargestNum.largestNum(new int[]{4,2,1,3}),expected);
    }
    @Test
    public void Test4(){
        int[] expected = {1,4};
        Assert.assertArrayEquals(LargestNum.largestNum(new int[]{4,2,1,3,6}),expected);
    }
    @Test
    public void Test5(){
        int[] expected = {1,2};
        Assert.assertArrayEquals(LargestNum.largestNum(new int[]{1,2}),expected);
    }
    @Test
    public void Test6(){
        int[] expected = {6,10};
        Assert.assertArrayEquals(LargestNum.largestNum(new int[]{8,4,2,10,3,6,7,9,1}),expected);
    }
    @Test
    public void Test7(){
        int[] expected = {0,7};
        Assert.assertArrayEquals(LargestNum.largestNum(new int[]{1,11,3,0,15,5,2,4,10,7,12,6}),expected);
    }
}
