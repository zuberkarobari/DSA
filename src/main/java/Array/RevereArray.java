package Array;

import java.util.Arrays;

public class RevereArray {
    static void returnEvenInteger(int [] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] givenArray={1,2,3,4,5,7,8,9,10,12,13};
        System.out.println("Original Array: " + Arrays.toString(givenArray));
        returnEvenInteger(givenArray);
        System.out.println("Reverse Array: " + Arrays.toString(givenArray));
    }
}



















//        int [] resultArr=new int[arr.length-1];
//        int idx=0;
//        int length=arr.length;
//        for (int i=length-1;i>=0;i--){
//            resultArr[idx]=arr[i];
//        }
//        return null;