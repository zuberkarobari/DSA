package Array;

public class minimumValueArray {
    static int minValue(int[] arr){
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
//        int min = arr[0];
//
//        for (int value : arr) {
//            if (value < min) {
//                min = value;
//            }
//        }
        return min;
    }

    public static void main(String[] args) {
        int [] givenArray={11,15,5,7,8,9,10,12,13};
        int i = minValue(givenArray);
        System.out.println("minimum value : " +i);
    }
}
