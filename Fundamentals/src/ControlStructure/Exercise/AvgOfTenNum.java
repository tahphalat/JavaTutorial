import java.util.*;

public class AvgOfTenNum{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int n=0;
    for(int i=0 ; i<10 ; i++){
      String input = scanner.nextLine();
      int value = Integer.parseInt(input);
      sum+=value;
      n=i;
    }
    System.out.println(sum/(n+1));
  }
}
