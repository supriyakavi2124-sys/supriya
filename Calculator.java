class calculator{
int add(int a,int b){
return a+b;
}
int sub(int a,int b){
return a-b;
}
int multiplication(int a,int b){
return a*b;
}
double division(int a,int b){
return a/b;
}
}
public class Calculator{
public static void main(string []args){
calculator.obj=new calculator();
System.out.println("addition"+obj.add(5,5));
System.out.println("subraction"+obj.sub(19,5));
System.out.println("multiplication"+obj.multi(10,10));
System.out.println("division"+obj.div(10/3));
}
}