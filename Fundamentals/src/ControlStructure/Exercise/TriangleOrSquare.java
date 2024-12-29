import java.util.*;

public class TriangleOrSquare{
  public static void main(String[] args){
    System.out.println("'T' for Triangle");
    System.out.println("'S' for Square");

    Scanner scanner = new Scanner(System.in);
    String option = scanner.nextLine();

//   double ans;
//
//   if(option.equals("T")) ans = getTriangleArea();
//   else ans = getSquareArea();

    String ans = switch(option){
      case "T" -> String.valueOf(getTriangleArea());
      case "S" -> Double.toString(getSquareArea());
      default -> "N/A";
    };
    
    System.out.println("ans : " + ans);
  }

  private static double getTriangleArea(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter H: ");
    String inputH = scanner.nextLine();
    int H = Integer.valueOf(inputH);

    System.out.println("Enter W: ");
    String inputW = scanner.nextLine();
    int W = Integer.valueOf(inputW);

    return (0.5)*H*W;

  }

  private static double getSquareArea(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter W: ");
    String inputW = scanner.nextLine();
    int W = Integer.parseInt(inputW);
    
    return W*W;
  }
}

// String to int 
//  Integer.valueOf();
//  Integer.parseInt();
//
// Integer to String
//  String.valueOf();
//  Integer.toString();
