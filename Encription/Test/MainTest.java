import com.company.Main;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void canary() {
        Assert.assertTrue(true);
    }

    @Test
    public void test1(){
        String expected = "zab";
        String output = Main.ceaserEncription("xyz",2);
        Assert.assertEquals(expected,output);
    }
    @Test
    public void test2(){
        String expected = "bcd";
        String output = Main.ceaserEncription("abc",1);
        Assert.assertEquals(expected,output);
    }
    @Test
    public void test3(){
        String expected = "efgh";
        String output = Main.ceaserEncription("abcd",4);
        Assert.assertEquals(expected,output);
    }
    @Test
    public void test4(){
        String expected = "jkkcovjgtg";
        String output = Main.ceaserEncription("hiiamthere",2);
        Assert.assertEquals(expected,output);
    }
    @Test
    public void test5(){
        String expected = "qrstu";
        String output = Main.ceaserEncription("pqrst",1);
        Assert.assertEquals(expected,output);
    } @Test
    public void test6(){
        String expected = "jga";
        String output = Main.ceaserEncription("hey",2);
        Assert.assertEquals(expected,output);
    } @Test
    public void test7(){
        String expected = "hwemw";
        String output = Main.ceaserEncription("fucku",2);
        Assert.assertEquals(expected,output);
    }
    @Test
    public void test8(){
        String expected = "bcicfkuj";
        String output = Main.ceaserEncription("Jagadish",2);
        Assert.assertEquals(expected,output);
    }

}
