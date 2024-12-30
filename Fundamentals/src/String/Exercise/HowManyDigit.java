package String.Exercise;

public class HowManyDigit {
  public static void main(String[] args){
    String input = "aslkdjf19847";
    int cnt=0;   
    for(var e:input.toCharArray()){
      if(Character.isDigit(e)) cnt++;
    }
    System.out.println(cnt);
  }
}
