public class PalindromeNumberChecker{
  public static void main(String[] args){
    int[] set1 = {1,2,3,2,1};
    int[] set2 = {1,2,2,1};
    int[] set3 = {1,2,3,4,1};

    System.out.println(checkPalindrome(set1));
    System.out.println(checkPalindrome(set2));
    System.out.println(checkPalindrome(set3));
  }

  private static Boolean checkPalindrome(int[] arr){
    int left = 0;
    int right = arr.length-1;
    while(left <= right){
      if(arr[left++]!=arr[right--]) return false;
    }
    return true;
  }
}
