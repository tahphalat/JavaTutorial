package ControlStructure;
// Loops : 
//    For, While, Do-while, ForEach
// Recursive Function Calls

import java.util.List;
import java.util.Random;


public class IterationTechniques {

    public static void main(String[] args) {
        plainForLoop();
        line();
        whileLoop();
        line();
        doWhileLoop();
        line();
        int recursiveValue = recursiveExample(5);
        System.out.println("recursiveValue: " + recursiveValue);
        line();
        forEachExample();
    }

    private static void line() {
        System.out.println("=========");
    }

          // For ================================= 
    // String concat - counting
    public static void plainForLoop() {
        String message = "";
        // Building block - Initialization, Condition, Updating
        for (int n = 1; n <= 10; n++) {
            message += "\n";
        }
        System.out.println("plainForLoop: " + message);
    }
          // While-DoWhile =================================
    // Example Dice - until get 4 : while
    public static void whileLoop() {
        Random rnd = new Random();
        int dice = 1;
        int counter = 0;
        // Check before do something
        while (dice != 4) {
            dice = rnd.nextInt(6) + 1;
            System.out.println("Dice: " + dice);
            counter++;
        }
        System.out.println("whileLoop dice amount until 4: " + counter);
    }

    // Example Dice - 4 : do-while
    public static void doWhileLoop() {
        Random rnd = new Random();
        int dice = 1;
        int counter = 0;
        // Do something then start checking
        do {
            dice = rnd.nextInt(6) + 1;
            System.out.println("Dice: " + dice);
            counter++;
        } while (dice != 4);
        System.out.println("whileLoop dice amount until 4: " + counter);
    }



    public static int recursiveExample(int count) {
        // Store the function/method itself to JVM's Stack and then resolve (pop) once base case complete
        if (count < 0 || count ==0)  return 0; 
        var recursiveValue = recursiveExample(count - 1);
        System.out.println("recursiveValue: " + recursiveValue);
        return recursiveValue + 1;
    }

    // Summation - 14
    public static void forEachExample() {
        // Use on Array/List with expectation to do on every element
            // Array
        int sum1 = 0;
        int[] exampleArray = new int[]{5,2,3,4};
        for (int n : exampleArray) {
            sum1 += n;
        }
        System.out.println("sum1: " +sum1);

            // List
        int sum2 = 0;
        List<Integer> exampleList = List.of(5,2,3,4);
        for (int n : exampleList) {
            sum2 += n;
        }
        System.out.println("sum2: " +sum2);
    }
}
