import java.util.Scanner;
public class Frequecy{
void initialize(int array[],int size,Scanner input){
for(int i=0;i<size;i++){
System.out.println("Enter the value : "+i+1);
array[i]=input.nextInt();
}
}


public static void main(String arg[]){
System.out.println("Enter the size of array ");

Scanner input=new Scanner(System.in);
int size=input.nextInt();

Frequecy init=new Frequecy();
int array1[]=new int[size];

init.initialize(array1,size,input);
for(int i=0;i<size;i++){
System.out.println(array1[i]);
}

}
}