import java.util.*;
public class Vowels{
public static void main(String args[]){
String s="Hello World";
int vowels=0;
int con=0;
for(int i=0;i<s.length;i++){
char ch=s.charat(i);
if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
vowels++;
}else{
consonants++;
}
}
System.out.println("vowels"+vowels);
System.out.println("consonants"+con);
}
}



