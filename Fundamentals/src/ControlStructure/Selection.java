package ControlStructure;

public class Selection{
  public static void main(String[] args){
    simpleIfExample();
    line();
    validationByGuardClause(-3);
    line();
    ifElseExample(true);
    ifElseIfExample("GREEN");
    switchExample("Sunday");
    nestedIf(1);
  }

  public static void line(){
    System.out.println("------------------------");
  }


        // Simple If ----------------------------------------
  private static void simpleIfExample(){
    int amount = 20;
    System.out.println("Step 1"); 
    if(amount>10){
      System.out.println("more than 10"); 
    }
    System.out.println("Step 2"); 
    System.out.println("Step 3"); 
  }

  private static void validationByGuardClause(int amount){
    if(amount < 0){
      System.out.println("Negative Number");
      return ;
    }
    System.out.println("Accept amount: " + amount);
  }

        // If Else ----------------------------------------
  // Ex : Take a walk 
  private static void ifElseExample( boolean isColdOutSide ){
    // hot - Tank Top, cold - sweater
    String shirt = "";
    if(isColdOutSide){
      shirt = "sweater";
    } else{
      shirt = "Tank Top";
    }
    System.out.println("I need to wear " + shirt + " to go out side.");
  }

        //If Else-if and switch (usually use when it has more than 3 conditions)
  // Ex : traffic light
  private static void ifElseIfExample(String light){
    int speed = 40;
    // yellow = slower, red = stop, green = faster
      // use equal to compare String [ compare to value & reference]
    if(light.equals("RED")){
      speed = 0 ;
    } else if(light.equals("YELLOW")) {
      speed = 20;
    } else if(light.equals("GREEN")){
      speed = 60;
    }
    System.out.println("Current speed : " + speed);
    
    
  }
        //Switch ----------------------------------------
  // Ex : Is holiday
  private static void switchExample(String day){

  // boolean isWeekend=false; 
  // switch(day){
  //   case "Saturday":
  //   case "Sunday":
  //     isWeekend = true; 
  //     break;
  //   case "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday":
  //     isWeekend = false;
  //     break;
  //   default:
  //     System.out.println("N/A");
  //     break;
  //  }

        // another way to use switch
    boolean isWeekend= switch(day){
//      case "Saturday", "Sunday" -> true;
//      case "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday"->false;
    // another way 
      case "Saturday", "Sunday" -> {
        System.out.println("Hi");
        yield true;
      }
      case "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday"->{
        System.out.println("Hi");
        yield false;
      }
      default -> false;
    };

    if(isWeekend)System.out.println("Weekend");
    else  System.out.println("Weekday"); 
  }


        // Nest if (if ซ้อนกัน) 
  // validate Input - log example
  private static void nestedIf(int amount){
    boolean isEnabledEmergency = true;
    if(amount < 0) {
      System.out.println("Negative amount !! " + amount);
      if(isEnabledEmergency) System.out.println("Emergency : true");
      return;
    }
    System.out.println("Success in Nested");
      
  }
}

