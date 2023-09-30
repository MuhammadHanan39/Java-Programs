import java.util.Scanner;
public class Minimum{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
int array[]=new int[5];
System.out.println("Enter the 5 values of array: ");
for(int i=0;i<5;i++)
array[i]=input.nextInt();
int min=array[0];
for(int i=0;i<4;i++){
if(min>array[i+1])
min=array[i+1];
else
min=min;}
System.out.println("minimum value is :"+min);
}
}