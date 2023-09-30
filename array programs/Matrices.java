public class Matrices{
public static void main(String args []){
int result[][]=new int[2][2];
int array1[][]={{1,2},{2,3}};
int array2[][]={{1,1},{2,2}};
for(int i=0;i<2;i++){
for(int j=0;j<2;j++)
result[i][j]=array1[i][j]+array2[i][j];
}
System.out.println("sum of two matrix is :");
for(int i=0;i<2;i++){
System.out.print("|");
for(int j=0;j<2;j++)
System.out.print(result[i][j]+" ");
System.out.print("|\n");}
}
}