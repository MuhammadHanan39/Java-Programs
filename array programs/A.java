import java.util.Scanner;
public class A{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int marks[];
marks =new int[5];
for(int i=0;i<5;i++)
marks[i]=sc.nextInt();
System.out.println("your inputted numbers are : ");
for(int i=0;i<5;i++)
System.out.println(marks[i]);
}
}