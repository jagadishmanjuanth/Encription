package Sum;

import java.util.Arrays;
import java.util.HashMap;

public class SumOfTwoNum {

//
//    public static int[] twoNumSum(int[] array, int target) {
//        for (int i = 0; i < array.length - 1; i++) {
//            int firstNum = array[i];
//            for (int j = 0; j < array.length; j++) {
//                int secondNum = array[j];
//                boolean isEqualToTarget = firstNum + secondNum == target;
//                if (isEqualToTarget) {
//
//                    int[] increment = new int[]{secondNum, firstNum};
//                    int[] decrement = new int[]{firstNum, secondNum};
//
//                    return firstNum > secondNum ? increment : decrement;
//                }
//            }
//        }
//        return new int[0];
////    }
//
//    public static  int[] twoNumSum(int[] array, int targetSum){
//        Arrays.sort(array);
//        int left = 0;
//        int right = array.length - 1;
//
//        while (left < right){
//
//            int currentSum = array[left] + array[right];
//
//            if (currentSum == targetSum){
//                return new int[] {array[left],array[right]};
//            }else if (currentSum < targetSum){
//                left++;
//            }else if (currentSum > targetSum){
//                right--;
//            }
//
//        }
//        return new int[0];
//    }

    public static int[] twoNumSum(int[] array, int target){
        HashMap<Integer,Boolean> nums = new HashMap<>();
        for (int num:array) {
            int potentialMatch = target - num;
            if(nums.containsKey(potentialMatch)){
                return potentialMatch > num ? new int[]{num,potentialMatch}:new int[]{potentialMatch,num};
            }else {
                nums.put(num,true);
            }

        }
        return new int[0];
    }
    public static void main(String[] args) { twoNumSum(new int[]{1, 5, 9, 5, -1, 15}, 10);
    }
}