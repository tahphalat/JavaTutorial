import java.util.*;

public class LargestFromStreamOfInput {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int value,max=0;
    do{
      String input = scanner.nextLine();
      value = Integer.valueOf(input);
      if(value > max) {
        max = value;
        System.out.println("Largest value has changed to "+max);
      }
    }while(value >=0 );
    if(max>=0) System.out.println("Largest number from valid stream : " + max);
    else System.out.println("N/A");
  }
}
