package Array;


import java.util.Arrays;

public class MoveZeroToEnd {

    static void  printArray(int []arr){
        for (int num : arr){
            System.out.print(" "+num);
            //System.out.println();
        }

    }
    static void returnMovedZeroArray(int[] arr){
        int j=0;
        for (int i=0;i<arr.length; i++){
            if (arr[i]!=0&&arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if (arr[j]!=0){
                j++;
            }
        }
    }
    void arrayDemo(){
        int [] givenArray={1,2,0,3,0,4,5,0,6};
        printArray(givenArray);
        System.out.println();
        returnMovedZeroArray(givenArray);
        printArray(givenArray);
    }
    public static void main(String[] args) {
        MoveZeroToEnd moveZeroToEnd=new MoveZeroToEnd();
        moveZeroToEnd.arrayDemo();
    }
}
