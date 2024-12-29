package Array.Exercise;

public class isPrimeNumberUtil{
//  public static  void main(String[] args){
//
//    System.out.println(isPrime(2));
//  }
  public static Boolean isPrime(int value){
    if(value < 2) return false;
    for(int i=2 ; i<=(int)Math.sqrt(value) ; i++){
      if(value%i==0) return false;
    }
    return true;
  }
}
