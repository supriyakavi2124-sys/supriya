public class loop{
public static void main(String[]args){
int i=1;
while(i<=5){
int j=1;
while(j<=5-i){
System.out.print("");
j++;
}
int k=1;
while(k<=2*i-1){
System.out.print("*");
k++;
}
System.out.print("");
i++;
}
}
}
