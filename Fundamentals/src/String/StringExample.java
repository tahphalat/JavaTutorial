package String;
import java.util.*;

public class StringExample {
    public static void main(String[] args){
        String name = "Tom";
        System.out.println(name);
        name = name + " The";
        name = name.concat(" cat");
        System.out.println(name);

        char[] nameCharArr = name.toCharArray();
        System.out.println(Arrays.toString(nameCharArr));


        //String has many Utiliy method
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        //Compare String - use "equals" เพราะมันแม่นสุดแล้ว
        var ex1 = "Jerry";
        var ex2 = "TOM";
        var ex3 = "Tom";

        System.out.println(ex1.equals(ex2));
        System.out.println(ex3.equalsIgnoreCase(ex2));

        //##############################################
        String _name = "Jerry";
        int exp = 5;
        String favFood = "cheese";

        line();
        stringBuilderEx();
        //##############################################
            //Other Utilities
            // ex : "Jerry 5 cheese" to "Jerry:5:cheese" เหมาะกับตอนที่เราไม่รู้จน. string ที่เราจะเอามาต่อกัน
            String[] strArray = {_name, String.valueOf(exp), favFood};
            String joinWithCustomDelimeter = String.join(":", strArray);
            System.out.println(joinWithCustomDelimeter);

        //##############################################
            //Multiline String
        line();
        String multilineString =
                """
                    Hello World.
                    We're using Java.      
                """;
        System.out.println(multilineString);

        //##############################################
    }

    private static void line(){
        System.out.println("====================================");
    }

    private static void stringBuilderEx() {
        // การ concat มี 2 แบบ
        String _name = "Jerry";
        int exp = 5;
        String favFood = "cheese";

        // แบบแรก ทำง่าย แต่เปลือง
        String key = _name + ":" + exp + ":" + favFood; // เกิดการ concat 4 times

        // แบบที่ 2 ทำงานไวกว่า ประหยัดกว่า
        StringBuilder sb = new StringBuilder();
        sb.append(_name);
        sb.append(":");
        sb.append(exp);
        sb.append(":");
        sb.append(favFood);

        String keyBySb = sb.toString();

        //Output
        System.out.println("key :" + key);
        System.out.println("key BySb " + keyBySb);

            //New java
        //System.out.println(STR."\{_name}:\{exp}:\{favFood}");
    }

}
