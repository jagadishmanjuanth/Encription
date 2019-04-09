import org.junit.Assert;
import org.junit.Test;

public class SubSortArrayTest {

    @Test
    public void canary(){
        Assert.assertTrue(true);
    }


    @Test
    public void test1(){
        int [] expected = {3,4};
        int [] output = SubSort.subSortArray(new int[]{1,2,3,5,4,6,9,11,12,13,14});
        Assert.assertArrayEquals(output,expected);
    }
    @Test
    public void test2(){
        int [] expected = {-1,-1};
        int [] output = SubSort.subSortArray(new int[]{1,2});
        Assert.assertArrayEquals(output,expected);
    }
    @Test
    public void test3(){
        int [] expected = {1,4};
        int [] output = SubSort.subSortArray(new int[]{1,4,3,5,4,6,9,11,12,13,14});
        Assert.assertArrayEquals(output,expected);
    }

    @Test
    public void test5(){
        int [] expected = {3,4};
        int [] output = SubSort.subSortArray(new int[]{-1,0,1,3,2,6,9,11,12,13,14});
        Assert.assertArrayEquals(output,expected);
    }
    @Test
    public void test6(){
        int [] expected = {3,10};
        int [] output = SubSort.subSortArray(new int[]{1,2,3,5,4,6,9,15,12,13,14});
        Assert.assertArrayEquals(output,expected);
    }
    @Test
    public void test7(){
        int [] expected = {0,11};
        int [] output = SubSort.subSortArray(new int[]{1,2,3,5,4,6,9,11,12,13,14,-1});
        Assert.assertArrayEquals(output,expected);
    }
    @Test
    public void test8(){
        int [] expected = {0,11};
        int [] output = SubSort.subSortArray(new int[]{1,2,3,5,4,-6,9,11,12,13,14,10});
        Assert.assertArrayEquals(output,expected);
    }

















}






