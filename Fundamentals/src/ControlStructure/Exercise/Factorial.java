import java.util.*;

public class Factorial{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    int input_value = Integer.parseInt(input);

    int ans = getFactorial(input_value);
    System.out.println(ans);
  }

  private static int getFactorial(int n){
    if(n==0 || n==1)  return 1;

    return n*getFactorial(n-1);
  }
}
