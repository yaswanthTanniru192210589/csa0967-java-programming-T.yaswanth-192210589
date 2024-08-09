 import java.util.Scanner;
class multi{
public static void main(String[] args){
Scanner reader=new Scanner(System.in);
System.out.println("enter positive integer");
int n=reader.nextInt();
int i;
for(i=1;i<=10;i++){
System.out.println(n+"*"+i+"="+(n*i));
}
}}