package TaskString;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//public class StringBuilderTask {
//    String str = ("onE    oF the biGGest REASONS why    Java is SO poPular is the platform     independence.     \n" +
//            "PROGRAMS can run on several different types   OF COMPUTER; as long as THE    computer    has a    \n" +
//            "JaVa RUNtime environment (jRE) installed, a jAVA program CAN run oN it.");
//
//public void sBChange(){
//    StringBuilder sb = new StringBuilder(str);
//    sb = new StringBuilder(str.toLowerCase(Locale.ROOT));
////    String words[]= str.split ("\\s");
//    String pattern="\\s+";
//    String replace=" ";
//
//    Pattern p= Pattern.compile(pattern);
//    Matcher m=p.matcher(sb);
//
//    sb= new StringBuilder(m.replaceAll(replace));
//        System.out.println(sb);
//    String words[]=str.split("\\s");
//    String toUpperStr="";
//    for(String word:words){
//        String firstLetter=word.substring(0,1);
//        String remLetters=word.substring(1);
//        toUpperStr+=firstLetter.toUpperCase()+remLetters+" ";
//    }
//    System.out.println("Input : "+ str);
//    System.out.println("\nThe result  line :  "+toUpperStr);
//}
//
//}