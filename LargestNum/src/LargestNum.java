import java.util.HashMap;

public class LargestNum {
    public static int[] largestNum (int[] array){
        int [] largestSequence = new int[2];
        HashMap<Integer,Boolean> nums = new HashMap<>();
        int longestLength = 0;
        for (int num :array) {
            nums.put(num,true);
        }
        for (int num :array) {
            if (!nums.containsKey(num)){
                continue;
            }

            int  currentLength = 1;
            int right = num + 1;
            int left = num - 1;


            while (nums.containsKey(left)){
                nums.put(num,false);
                currentLength += 1;
                left --;
            }
            while (nums.containsKey(right)){
                nums.put(num,false);
                currentLength ++;
                right++;
            }
            if (currentLength > longestLength){
                longestLength = currentLength;
                largestSequence = new int[]{left + 1, right - 1};
            }
        }
        return largestSequence;
    }


}
