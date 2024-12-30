package String.Exercise;

import java.util.*;

public class ILoveSth {
  public static void main(String[] args){
    String input = "Hello, you are so beaUtifUl";
    String lowerInput =input.toLowerCase();
    char[] inputChar = lowerInput.toCharArray();
    countU(inputChar);
    countVowel(inputChar);
    countEveryThing();
    //countEveryThing(inputChar);
  }
  private static void countU(char[] input){
    int cnt=0;
    for(int i=0 ; i<input.length ; i++){
      if(input[i] == 'u') cnt++;
    }
    System.out.println(cnt);
  }

  private static void countVowel(char[] input){
    int cnt=0;
    char[] vowel = {
      'a','e','i','o','u'
    };
    for(int i=0 ; i<input.length ; i++){
      for(var e:vowel){
        if(input[i] == e) cnt++;
      }
    }
    System.out.println(cnt);
  }

  //private static void countEveryThing(char[] input){
  private static void countEveryThing(){
    String input = "safdit";
    int[] cnt = new int[26];
    for(var e:input.toCharArray()){
      cnt[e-'a']++;
    }
  for(int i=0 ; i<cnt.length ; i++){
    char c = (char)('a'+i);
    System.out.println(c + ":" + cnt[i]);
  }
  }

  private static void line(){
    System.out.println("=========================");
  }
}

