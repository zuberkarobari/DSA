package Array;

import java.util.Arrays;

public class EvenIntegersInArray {

    static int[] returnEvenInteger(int [] arr){
        int resultArrSize=0;
        for (int k : arr) {
            if (k % 2 == 0) {
                resultArrSize++;
            }
        }
        int[] resultArray =new int[resultArrSize];
        int idx=0;
        for (int j =0;j<arr.length;j++){
            if (arr[j]%2==0){
                resultArray[idx]=arr[j];
                idx++;
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int [] givenArray={1,2,3,4,5,7,8,9,10,12,13};
        System.out.println("Original Array: " + Arrays.toString(givenArray));
        int[] ints = returnEvenInteger(givenArray);
        System.out.println("Even Array: " + Arrays.toString(ints));

    }

}
