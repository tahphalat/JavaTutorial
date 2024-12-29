import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OutputInput{
    public static void main(String[] args) throws IOException{
        //         // Scanner
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter name: ");
        // String name = input.nextLine(); // Scanner

        // System.out.print("Enter surname: ");
        // String surname = input.nextLine(); // Scanner

        // System.out.print("Your name is " + name + " ");
        // System.out.println(surname);
                
                // InputStreamReader ==> ไวกว่า เมื่อ input มาก
        InputStreamReader inSR = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(inSR);

        System.out.print("Enter name: ");
        String name = input.readLine(); // InputStreamReader

        System.out.print("Enter surname: ");
        String surname = input.readLine(); // InputStreamReader

        System.out.print("Your name is " + name + " ");
        System.out.println(surname);
        System.out.println("Goodbye");
    }
}
