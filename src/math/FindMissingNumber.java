package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        System.out.println("The missing number in the array is: " +missingNumbers(array,10));

    }

    public static int missingNumbers(int[] array, int n){
        int num2 = 0;
        int num1 = 0;
        for(int i = 0; i<n; i++){
            num1 += i;
        }


        for(int i = 0; i < array.length; i++){
            num2 += i;
        }
        return (num1 - num2);
    }
}


