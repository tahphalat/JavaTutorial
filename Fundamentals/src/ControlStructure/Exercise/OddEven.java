
import java.util.*;

public class OddEven{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    int value = Integer.parseInt(input);
    //System.out.println(input);
    solution1(value);
    solution2(value);
  }

  private static void solution1(int n){
    if(n%2==0) System.out.println("Even");
    else System.out.println("Odd");
  }

  private static void solution2(int n){
    String ans = switch(n%2){
      case 0 -> "Even";
      case 1 -> "Odd";
      default -> "N/A";
    };
    System.out.println(ans);
  }

}
