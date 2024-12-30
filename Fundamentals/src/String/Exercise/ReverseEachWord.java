package String.Exercise;

public class ReverseEachWord {
    public static void main(String[] args){
        //Assume input has " " as a delimeter
        String input = "Hello world test"; // Expect ans = tset dlrow olleH
        String[] split = input.split(" ");
        String[] result = new String[split.length];

        for(int i=0 ; i<result.length ; i++){
          String reversed = reverse(split[i].toCharArray());
          result[i]=reversed;
        }
        System.out.println(String.join(" ", result));
    }

    private static String reverse(char[] arr){
      int left = 0;
      int right = arr.length-1;
      while(left <= right){
        char tmp = arr[left] ;
        arr[left] = arr[right];
        arr[right] = tmp;
        left++;
        right--;
      }
      return String.valueOf(arr);
    }
}
