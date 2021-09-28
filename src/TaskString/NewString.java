package TaskString;

public class NewString {
String str = ("onE    oF the biGGest REASONS why    Java is SO poPular is the platform     independence.     \n" +
        "PROGRAMS can run on several different types   OF COMPUTER; as long as THE    computer    has a    \n" +
        "JaVa RUNtime environment (jRE) installed, a jAVA program CAN run oN it.");
public void changingString(){
String str =this.str.replaceAll("\\s+"," ");
System.out.print(str);
    }
}
