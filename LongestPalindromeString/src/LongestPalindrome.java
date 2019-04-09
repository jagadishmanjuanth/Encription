public class LongestPalindrome {



public static String longestPalindrome(String string){
    int[] currentLongest = {0,1};

    for (int i = 0; i < string.length(); i++) {
        int[] odd = getTheLongestPalindrome(string,i - 1, i + 1);
        int[] even = getTheLongestPalindrome(string,i - 1, i);
        int[] longest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
        currentLongest = currentLongest[1] - currentLongest[0] > longest[1] - longest[0] ? currentLongest : longest;
    }
    return string.substring(currentLongest[0],currentLongest[1]);
}

    private static int[] getTheLongestPalindrome(String string, int leftindex, int rightIndex) {
        while (leftindex >= 0 && rightIndex < string.length()){
            if (string.charAt(leftindex) != string.charAt(rightIndex)){
                break;
            }
            leftindex--;
            rightIndex++;
        }
        return new int[] {leftindex + 1,rightIndex};
    }
//    public static String longestPalindrome(String string) {
//        String longest = "";
//        for (int i = 0; i < string.length(); i++) {
//            for (int j = i ; j < string.length(); j++) {
//                String substring = string.substring(i,j+1);
//
//                if (substring.length() > longest.length() && isPalindrome(substring)){
//                    longest = substring;
//                }
//            }
//        }
//        return longest;
//    }
//
//    private static boolean isPalindrome(String substring) {
//        int leftIdex = 0;
//        int rightIdex = substring.length() - 1;
//
//        while (leftIdex < rightIdex){
//            if (substring.charAt(leftIdex) != substring.charAt(rightIdex)){
//                return false;
//            }
//            leftIdex++;
//            rightIdex--;
//        }
//        return true;
//    }
}
