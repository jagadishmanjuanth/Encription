package SumTest;

import Sum.SumOfTwoNum;
import org.junit.Assert;
import org.junit.Test;

public class SumOfTwoNumTest {

    @Test
    public void Test1() {
        int[] expected = {4, 6};
        int[] result = SumOfTwoNum.twoNumSum(new int[]{4, 6}, 10);

        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void Test2() {
        int[] expected = {4, 8};
        int[] result = SumOfTwoNum.twoNumSum(new int[]{4, 8, 10, -1, 12, 9}, 12);

        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void Test3() {
        int[] expected = {4, 12};
        int[] result = SumOfTwoNum.twoNumSum(new int[]{4, 6, 8, -1, 0, 12, 4}, 16);

        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void Test4() {
        int[] expected = {0, 10};
        int[] result = SumOfTwoNum.twoNumSum(new int[]{0, 19, 1, 2, -1, 21, 10, 14}, 10);

        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void Test5() {
        int[] expected = {6, 8};
        int[] result = SumOfTwoNum.twoNumSum(new int[]{4, 6, 8}, 14);

        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void Test6() {
        int[] expected = {-1, 99};
        int[] result = SumOfTwoNum.twoNumSum(new int[]{8, 4, -1, -2, -5, 99, 8}, 98);

        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void Test7() {
        int[] expected = {-1, 199};
        int[] result = SumOfTwoNum.twoNumSum(new int[]{4, 6, 8, -1, 164, 223, 198, 199}, 198);

        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void Test8() {
        int[] expected = {4, 8};
        int[] result = SumOfTwoNum.twoNumSum(new int[]{4, 6, 8, 1, 9, -1, 0}, 12);

        Assert.assertArrayEquals(result, expected);
    }


}
