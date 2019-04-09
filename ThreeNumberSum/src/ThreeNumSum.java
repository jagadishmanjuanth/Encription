


import java.util.ArrayList;
import java.util.*;

class ThreeNumSum {
//    public static ArrayList<Integer[]> threeNumberSum(int[] array,int targetSum){
//        Arrays.sort(array);
//        ArrayList<Integer[]> resultsTriplets = new ArrayList<>();
//
//        for (int i = 0; i < array.length - 2; i++) {
//            int left = i + 1;
//            int right = array.length - 1;
//            while (left < right){
//                int resultSum = array[i] + array[left] + array[right];
//
//                if (resultSum == targetSum)
//                {
//                    Integer[] newTriplets = {array[i],array[left],array[right]};
//                    resultsTriplets.add(newTriplets);
//                    left++;
//                    right--;
//
//                }
//                else if (resultSum < targetSum){
//                    left++;
//                }else if (resultSum > targetSum){
//                    right--;
//                }
//            }
//        }
//        return resultsTriplets;
//    }

    public static ArrayList<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        ArrayList<Integer[]> triplets = new ArrayList<>();

        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;

            while (left < right) {
                int resultSum = array[i] + array[left] + array[right];
                if (resultSum == targetSum) {
                    Integer[] newTriplets = {array[i], array[left], array[right]};
                    triplets.add(newTriplets);
                    left++;
                    right--;
                } else if (resultSum < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return triplets;
    }

    public static void main(String[] args) {
        threeNumberSum(new int[]{1, 2, 3}, 6);
    }
}