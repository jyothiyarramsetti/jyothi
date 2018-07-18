import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Task2{
public static void main(String[] args){
Pattern p=Pattern.compile("[6789][0-9]{9}");
Matcher m=p.matcher("9005149588");
while(m.find()){
System.out.println(m.group());
}
}
}
