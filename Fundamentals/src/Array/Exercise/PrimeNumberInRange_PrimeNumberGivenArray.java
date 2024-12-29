package Array.Exercise;

import java.util.*;

import static Array.Exercise.isPrimeNumberUtil.isPrime;

public class PrimeNumberInRange_PrimeNumberGivenArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter range number to find prime number: ");
        int endRange = Integer.parseInt(scanner.nextLine());
        for (int n = 2; n <= endRange; n++) {
            boolean isCurrentNumberPrime = isPrime(n);
            if (isCurrentNumberPrime) {
                System.out.println(n + " is prime ✅");
            } else {
                System.out.println(n + " is not prime ❌");
            }
        }
        System.out.println("==========================");
        int[] set1 = {1,3,5,7,9,11,13,15};
        for(var e:set1) {
            boolean isCurrentNumberPrime = isPrime(e);
            if (isCurrentNumberPrime) {
                System.out.println(e + " is prime ✅");
            } else {
                System.out.println(e + " is not prime ❌");
            }
        }
    }
}