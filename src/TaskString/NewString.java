package TaskString;

import java.util.Locale;

public class NewString {
String str = ("onE    oF the biGGest REASONS why    Java is SO poPular is the platform     independence.     \n" +
        "PROGRAMS can run on several different types   OF COMPUTER; as long as THE    computer    has a    \n" +
        "JaVa RUNtime environment (jRE) installed, a jAVA program CAN run oN it.");
public void changingString(){
String string =this.str.replaceAll("\\s+"," ");
String str2=string.toLowerCase(Locale.ROOT);
    String words[]=str2.split("\\s");
    String toUpperStr="";
    for(String word:words){
        String firstLetter=word.substring(0,1);
        String remLetters=word.substring(1);
        toUpperStr+=firstLetter.toUpperCase()+remLetters+" ";
    }
    System.out.println("Input : "+ str);
    System.out.println("\nThe result line :  "+toUpperStr);
 }
}
