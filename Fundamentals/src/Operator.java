public class Operator {

    /*
        Type of operator in Java
        - Arithmetic
        - Relational
        - Logical
        - Bitwise
        - Assignment operators
        - Unary operators
        - Ternary
    */
    public static void main(String[] args) {
        // Execute method
        arithmetic(); // กระบวนการทางคณิต
        relational();
        logical();
        bitwise();
        assignment();
        unary();
        ternary();
    }

    public static void arithmetic() {
        var add = 10 + 10;
        var minus =  10 - 10;
        var multiply =  10 * 10;
        var divide =  10 / 10;
        var modulo = 89 % 10; // 9
    }

    public static void relational() {
        // relation or comparison
        var isEqual = 10 == 10;
        var isNotEqual = 10 != 10;
        var isGreaterThan = 25 > 10;
        var isGreaterThanEqual = 25 >= 25;
        var isLessThan = 25 < 10;
        var isLessThanEqual = 25 <= 25;
    }

    public static void logical() {
        // AND, OR, NOT
        // AND - both of them true = true
        var score = 85;
        var isScoreGreaterThanEqualZero = score >= 0;
        var isScoreLessThanHundred = score <= 100;
        var isInGradeScore = isScoreGreaterThanEqualZero && isScoreLessThanHundred;
        // OR - Either of them true = true
        var day = 23;
        var isGoToMall = (day >= 5 && day <= 10) || (day >= 20 && day <= 25);

        // Java Short circuit
        // AND - Left is FALSE => FALSE
        // OR - Left is TRUE => TRUE

        // NOT
        var isEnabled = !true; // false
    }

    public static void bitwise() {
        // Example assume unsigned 4 bits = 0 - 15
        var exampleValue1 = 7; // 111
        var exampleValue2 = 3; // 011
                // & bitwise AND
        System.out.println("AND: " + (exampleValue1&exampleValue2)); // 3
        System.out.println("AND: " + (exampleValue1&exampleValue2)); // 3
                // | bitwise OR
        System.out.println("OR: " + (exampleValue1|exampleValue2)); // 7
                // ^ bitwise XOR
        System.out.println("XOR: "+(exampleValue1 ^ exampleValue2)); // 4

                // ~ bitwise complement
        // 0 - positive, 1 - negative
        //
        // 7 => 0_111, -7 => 1_001 (2's complement)
        // 1 => 0_001, -1 => 1_111 (0_001 => 1_110 + 1 => 1_111)
        //
        // ~ => 1's complement
        // 7 => 0_111 => 1_000 => -8
        System.out.println("Complement: " + ~exampleValue1);
        // -7 => 1_001 => 0_110 => 6
        System.out.println("Complement: " + ~(-7));

                // << left shift
        // 0b001 << 2 => 0b100
        System.out.println("1 Left shift 2: " + (1 << 2));
        // 0b111 << 2 => 0b11100
        System.out.println("7 Left shift 2: " + (7 << 2));

                // >> right shift (signed)
        // 0b100 << 2 => 0b001
        System.out.println("4 Right shift 2: " + (4 >> 2));
        // -8 >> 2, 1_000 >> 2 => 1_110 = -2
        System.out.println("-8 Right shift (signed) 2: " + (-8 >> 2));
                // >>> right shift (unsigned)
        // Positive: 8 >>> 2 => 0010 = 2
        System.out.println("8 Right shift (unsigned) 2: " + (8 >>> 2));
        // Negative: -8 >>> 2 (32 bits) => 11 1111111111 1111111111 1111111000
        // 00111111111111111111111111111110 => 1073741822
        System.out.println("-8 Right shift (unsigned) 2: " + (-8 >>> 2));
    }

    public static void assignment() {
        // assign value to variable
        int day = 25;
        // Combination arithmetic + assignment
        int amount = 20;
        amount += 10; // amount = amount + 10;
        System.out.println("Current amount = "+amount);
    }

    public static void unary() {
        // Incremental / Decremental
        // ++, --
        // in front - do operation before execution of variable
        // in back - do operation after execution of variable
        var day = 10;
        day++;
        System.out.println("Incremental: "+day); // day = 11
        day--;
        System.out.println("Decremental: "+day); // day = 10

        var score = 100;
//        System.out.println("Incremental: \{++score}"); // score = 101
        System.out.println("Incremental: "+score++); // score = 100
        // score = 101 starting from this line
        System.out.println("Incremental: "+score);
    }

    public static void ternary() {
        // If-Else
        var score = 85;
        // Consider PASS / NOT_PASS
//        if (score >= 80) {
//            PASS
//        } else {
//            NOT_PASS
//        }
        var grade = score >= 80 ? "PASS" : "NOT_PASS";
        System.out.println("Grade: "+grade);
    }
}
