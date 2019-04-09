import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeTest {

    @Test
    public void canary() {
        Assert.assertTrue(true);
    }

    @Test
    public void Test1() {
        String expected = "xyzzyx";
        String input = "abaxyzzyxf";
        Assert.assertEquals(expected, LongestPalindrome.longestPalindrome(input));
    }

    @Test
    public void Test2() {
        String expected = "f";
        String input = "f";
        Assert.assertEquals(expected, LongestPalindrome.longestPalindrome(input));
    }

    @Test
    public void Test3() {
        String expected = "aba";
        String input = "aba";
        Assert.assertEquals(expected, LongestPalindrome.longestPalindrome(input));
    }

    @Test
    public void Test4() {
        String expected = "malylam";
        String input = "abamalylam";
        Assert.assertEquals(expected, LongestPalindrome.longestPalindrome(input));
    }

    @Test
    public void Test5() {
        String expected = "bab";
        String input = "aaabbbnababt";
        Assert.assertEquals(expected, LongestPalindrome.longestPalindrome(input));
    }

    @Test
    public void Test6() {
        String expected = "xxxx";
        String input = "xxxxyyy";
        Assert.assertEquals(expected, LongestPalindrome.longestPalindrome(input));
    }

    @Test
    public void Test7() {
        String expected = "aaaaaa";
        String input = "ffaaaaaa";
        Assert.assertEquals(expected, LongestPalindrome.longestPalindrome(input));
    }

    @Test
    public void Test8() {
        String expected = "rrrrr";
        String input = "bbbrrrrr";
        Assert.assertEquals(expected, LongestPalindrome.longestPalindrome(input));
    }

    @Test
    public void Test9() {
        String expected = "bbb";
        String input = "abarrrbbb";
        Assert.assertEquals(expected, LongestPalindrome.longestPalindrome(input));
    }
}
