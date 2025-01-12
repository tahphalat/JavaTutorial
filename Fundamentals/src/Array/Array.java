import java.util.*;

// array in Java is reference type (has "null" value)
public class Array{
  public static void main(String[] args){
    String[] fruits = new String[3];
    fruits[2] = "Apple";
    System.out.println(fruits[2]);

    int numbers[] = new int[]{1,2,3,4,5};
    for(var e:numbers) System.out.println(e);

    String[] cars = {"Toyota", "Honda", "Susuki"};
    for(var e:cars) System.out.println(e);

    System.out.println("=============");
    int[] exToShowUtil = {3,2,1,9,3,6,5,8};
    //Ascending Order
    Arrays.sort(exToShowUtil);
    System.out.println(Arrays.toString(exToShowUtil));

    // Descending Order
    reverse(exToShowUtil);
    System.out.println(Arrays.toString(exToShowUtil));

    // another way : Use stream API
    exToShowUtil = new int[]{3,2,1,9,3,6,5,8};
    int[] descResult = Arrays.stream(exToShowUtil)
        .boxed()
        .sorted(Collections.reverseOrder())
        .mapToInt(Integer::intValue)
        .toArray();
    System.out.println(Arrays.toString(descResult));
  }
  
  private static void reverse(int[] arr){
    int left =0;
    int right = arr.length -1;
    while(left <= right){
      int tmp = arr[left];
      arr[left] = arr[right];
      arr[right] =  tmp;
      left++;
      right--;
    }
  }
}
