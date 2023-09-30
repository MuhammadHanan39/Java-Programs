public class Ascending{
public static void main(String arg[]){
int array[]={5,2,7,1,3};
for(int i=0;i<array.length;i++){
for(int j=i+1;j<array.length;j++){
if(array[i]>array[j]){
int arr=array[i];
array[i]=array[j];
array[j]=arr;
}
}
}
System.out.println("numbers in ascending order are: ");
for(int i=0;i<array.length;i++)
System.out.println(array[i]); 
}
}