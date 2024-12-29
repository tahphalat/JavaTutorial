import java.util.*;
public class MedOfArray{
  public static void main(String[] args){
    int[] set1 = {5,7,8,6,3};
    int[] set2 = {5,7,8,6,3,1};
    int[] set3 = {5};
    int[] set4 = new int[]{};

   System.out.println(getMed(set1)); 
   System.out.println(getMed(set2)); 
   System.out.println(getMed(set3)); 
   System.out.println(getMed(set4)); 
  }

  private static double getMed(int[] arr){
    int size = arr.length;  
    if(size == 0) return 0;
    else if(size==1) return arr[0];
    Boolean isEven = size%2==0;
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    //if(isEven) return arr[size/2-1] + arr[size/2])/0.5;
    if(isEven) return (double)(arr[size/2-1] + arr[size/2])/2;
    return arr[size/2];
  }
}
