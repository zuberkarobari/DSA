package Array;

public class SecondMaxArray {

    static int findSecondMax(int[] arr ){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int num : arr){
            if (num>max){
                secondMax=max;
                max=num;
            } else if (num>secondMax&&num!=max) {
                secondMax=num;
            }
        }
        
        return  secondMax;
    }
    public static void main(String[] args) {
        int [] givenArr={1,2,3,4,5,6,7,8,9,10,18};
        System.out.println(findSecondMax(givenArr));
    }
}
