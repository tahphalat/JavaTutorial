import java.util.*;
public class IsTheArraySorted {
  public static void main(String[] args){
    int[] set1 = {1,2,3,4,5};
    int[] set2 = {2,1,4,3,5};
    
    System.out.println(Arrays.toString(set1) + ": " + Boolean.toString(getCheck(set1)) + "\n" + Arrays.toString(set2) + ": " +Boolean.toString(getCheck(set2)));
  }

  private static Boolean getCheck(int[] arr){
    if(arr.length <=1) return true;
    //0 1 2 3 4
    for(int i=1 ; i<arr.length ; i++){
      int curr = arr[i];
      int prev = arr[i-1];
      if (curr < prev) return false;
    }
    return true;
  }
}
