import java.util.Scanner;
public class Average{
public static void main(String args[]){
Scanner input= new Scanner(System.in);
float average;
System.out.println("Enter the number of elements");
int element=input.nextInt();
int array[]=new int[element];
System.out.println("Enter the values to find its average: ");
for(int i=0;i<element;i++){
array[i]=input.nextInt();
}
int sum=0;
for(int i=0;i<element;i++){
sum+=array[i];
}
average =sum/element;
System.out.println("The average is :"+average);
}
}