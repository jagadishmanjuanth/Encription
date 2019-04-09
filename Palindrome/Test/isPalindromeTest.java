import org.junit.Assert;
import org.junit.Test;

public class isPalindromeTest {


    @Test
    public void canary(){
        Assert.assertTrue(true);
    }

    @Test
    public void test1(){

        Assert.assertTrue(Palindrome.isPalindrome("a"));
    }
    @Test
    public void test2(){
        boolean expexted = false;
        Assert.assertEquals(expexted,Palindrome.isPalindrome("aacb"));
    }
    @Test
    public void test3(){

        Assert.assertTrue(Palindrome.isPalindrome("MADAM"));
    }
    @Test
    public void test4(){
        Assert.assertTrue(Palindrome.isPalindrome("malylam"));
    }
    @Test
    public void test5(){
        Assert.assertTrue(Palindrome.isPalindrome("aabaa"));
    }
    @Test
    public void test6(){
        boolean expected = false;
        Assert.assertEquals(expected,Palindrome.isPalindrome("aabb"));
    }
    @Test
    public void test7(){
        Assert.assertTrue(Palindrome.isPalindrome("aaaaaaaabaaaaaaaa"));
    }@Test
    public void test8(){
        Assert.assertTrue(Palindrome.isPalindrome("aaccbccaa"));
    }
    @Test
    public void test9(){
        Assert.assertTrue(Palindrome.isPalindrome("aaaaaaaabbbbbbbaaaaaaaa"));
    }
    @Test
    public void test10(){
        Assert.assertTrue(Palindrome.isPalindrome("a"));
    }



//    public static boolean isPalindrome(String string){
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = string.length() - 1 ; i >= 0 ; i--) {
//            stringBuilder.append(string.charAt(i));
//        }
//        return string.equals(stringBuilder.toString());
//    }

}
