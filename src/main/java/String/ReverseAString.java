package String;

public class ReverseAString {

   static String reverseString(String givenString){
        int left=0;
       char charArr[]=givenString.toCharArray();
        int right=charArr.length-1;
        while(left<right){
            char temp=charArr[left];
            charArr[left]=charArr[right];
            charArr[right]=temp;
            left++;
            right--;
        }
        return new String(charArr);
    }
    public static void main(String[] args) {
       String givenString="Hello";
        System.out.println("Before : "+givenString);
          String reversed=reverseString(givenString);
        System.out.println("After : "+reversed);
    }
}
