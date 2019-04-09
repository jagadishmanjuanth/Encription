public class SubSort {

    public static int[] subSortArray(int[] array){

    int maxUnsortedValue = Integer.MIN_VALUE;
    int minUnsortedValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if(isUnsorted(i,num,array)){
                maxUnsortedValue = Math.max(maxUnsortedValue,num);
                minUnsortedValue = Math.min(minUnsortedValue,num);
            }

        }
        if (maxUnsortedValue == Integer.MIN_VALUE){
            return new int[] {-1,-1};
        }
        int unsortedLeftIndex = 0;
        while (minUnsortedValue >= array[unsortedLeftIndex]){
            unsortedLeftIndex++;
        }
        int unsortedRightIndex = array.length -1;
        while (maxUnsortedValue <= array[unsortedRightIndex]){
            unsortedRightIndex--;
        }
        return new int[] {unsortedLeftIndex ,unsortedRightIndex};
    }

    public static boolean isUnsorted(int i, int num, int[] array) {
        if (i == 0){
           return num > array[i + 1];
        }
        if (i == array.length - 1){
            return num < array[i - 1];
        }
        return num > array[i + 1] || num < array[i - 1];
    }


}




