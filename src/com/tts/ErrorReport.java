package com.tts;

public class ErrorReport {
    public static void main(String[] args) {
//illegal field names
//byte nybbles = 000bff10_0404; //byte a = 100;
//int int = 1; //int a = 5;
//int char = 'a'; //correct form should be char char1 = 'a';
//double double d1= 123.4; //double d1 = 123.4
//boolean boolean = true; //boolean one = true
//uninitialized fields with printing
//int thisIsntGoingToInitialize;
//        System.out.println(thisIsntGoingToInitialize);
//did not initialize or work...
//local variable
        String iNeedNoBurritos;
        {
            iNeedNoBurritos = "Gas is dangerous!";
        }
        System.out.println("Come on you know you wanna laugh!" + iNeedNoBurritos);
        //this one works and is funny dunno about legal though lol
        {
            String doIworkInHere;
            System.out.println("Is this working?" + doIworkInHere);
            //not intialized properly since the string should've been out of the {} and above the first {
        }
}
}
//google reserved words in java,
// https://en.wikipedia.org/wiki/Uninitialized_variable
// https://www.tutorialspoint.com/java/java_basic_datatypes.htm,https://www.informit.com/articles/article.aspx?p=2270972
// https://howtodoinjava.com/java/basics/java-naming-conventions/