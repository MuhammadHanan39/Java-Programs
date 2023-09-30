import java.util.Scanner;
public class Array1{
public static void main(String arg[]){

int array1[]=new int[5];
Scanner input=new Scanner(System.in);
System.out.println("Enter the values of array : ");
for(int i=0;i<5;i++){
array1[i]=input.nextInt();
}

int array2[]=new int[5];
for(int i=0;i<5;i++){
array2[i]=array1[i];
}
 
System.out.println("array2 values are ");
for(int i=0;i<5;i++){
System.out.println(array2[i]);
}

}
}