import java.util.Scanner;
public class Frequency_of_array2{
void initialize(int array[],int size,Scanner input){
for(int i=0;i<size;i++){
System.out.println("Enter the value : "+(i+1));
array[i]=input.nextInt();
}
}

int maximum(int array[]){
int max=array[0];
for(int i=0;i<array.length;i++){
if(max<array[i])
max=array[i];
}
return max;
}

int minimum(int array[]){
int min=array[0];
for(int i=0;i<array.length;i++){
if(min>array[i])
min=array[i];
}
return min;
}


public static void main(String arg[]){
System.out.println("Enter the size of array ");

Scanner input=new Scanner(System.in);
int size=input.nextInt();

Frequency_of_array2 init=new Frequency_of_array2();
int array1[]=new int[size];

init.initialize(array1,size,input);
int max=init.maximum(array1);
int min=init.minimum(array1);

for(int i=min;i<=size;i++){
int occurence=0;
for(int j=0;j<size;j++){
if(i==array1[j])
occurence++;
}
if(occurence>0)
System.out.println("occurence of number : "+i+" is "+occurence);
}

}
}