public class WrapperClass{
  public static void main(String[] args){
    basicWrapper();    
    parseTechnique();
  }

  public static void basicWrapper(){
    byte exampleOfByte = 127;

        // Boxing primitive to reference type
        Byte exampleOfByteBoxing = Byte.valueOf(exampleOfByte); 
        // Unboxing
        System.out.println(exampleOfByteBoxing.byteValue());
        
        // Example of auto boxing                       
         Byte autoBoxing = exampleOfByte;
         //Example of auto unboxing
         System.out.println(exampleOfByteBoxing);


         // int double long ใช้บ่อยตามลำดับ
        Short shortData = 100;
        Integer integerData = 100;
        Long longData = 100L;

        Double doubleData = 25.00;
        Float floatData = 25.00f;

        //BigDecimal => ค่าตัวเลขที่สูงมากๆๆ
        
        Character grade = 'D';
        System.out.println("isLetterOrDigit: " + Character.isLetterOrDigit(grade));
        
        Boolean isEnable = true; 
  }

  // parse parseTechnique = convert String to  wrapper class and unboxing to primitive 
  public static void parseTechnique(){
    //Auto unboxing => Integer(Wrapper => Int (primitive)
    int operand1 = Integer.parseInt("500");
    int operand2 = Integer.parseInt("100");
    System.out.println("Add: " + operand1 + operand2);
  }

}
