public class Palindrome {


    public static boolean isPalindrome(String string) {

        int leftIndex = 0;
        int rigthIndex = string.length() - 1;
        while (leftIndex < rigthIndex) {
            if (string.charAt(leftIndex) != string.charAt(rigthIndex)) {
                return false;
            }
            leftIndex++;
            rigthIndex--;
        }
        return true;
    }


    //
//    private static boolean isPalindrome(String string, int i) {
//        int j = string.length() - 1 - i;
//        return (i >= j) ? true : ((string.charAt(i) == string.charAt(j)) && isPalindrome(string, i + 1));
//    }
    //    public static boolean isPalindrome(String string){
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = string.length() - 1 ; i >= 0 ; i--) {
//            stringBuilder.append(string.charAt(i));
//        }
//        return string.equals(stringBuilder.toString());
//    }
//    public static boolean isPalindrome(String string){
//
//       String reverseString = "";
//
//        for (int i = string.length() - 1; i >= 0; i--) {
//            reverseString += string.charAt(i);
//        }
//        return reverseString.equals(string);
//    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
    }
}
