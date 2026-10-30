public class GenericMax{
static<T extends Comparable<T>>T findmax(T[] array){
T Max=array[0];
for(T element : array){
if((element.compareTo(Max))>0){
Max=element;
}
}
return Max;
}
public static void main(String[] args){
Integer[] intarray={12,45,7,89,34};
Double[] doublearray={3.5,9.2,1.1,7.8};
String[] stringarray={"banana","apple","mango","cheery"};
System.out.println("max int:"+findmax(intarray));
System.out.println("max double:"+findmax(doublearray));
System.out.println("max String:"+findmax(stringarray));
}
 }