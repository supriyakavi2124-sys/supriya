import java.util.*;
public class Selection{
public static void main(String[] args){
int[]arr={64,25,12,22,11};
for(int i=0;i<arr.length-1;i++);
int minindex=i;
for(int j=i+1;j<arr.length;j++){
if(arr[j]<arr[minindex]){
minindex=j;
}
}
temp=arr[i];
arr[i]=arr[minindex];
arr[minindex]=temp;
}
System.out.println("sorted array");
System.out.println(Array.toString(arr));
}
