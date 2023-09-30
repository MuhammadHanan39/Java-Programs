public class Mulmatrix{
public static void main(String arg[]){

//int matrix1[][];
//int matrix1[][]=new int[3][3];
int matrix1[][]={{1,2,3},{2,1,2},{2,2,2}};

int matrix2[][]={{1,3,4},{2,1,0},{0,1,2}};

int result[][]={{0,0,0},{0,0,0},{0,0,0}}//array to store the result

//loop for finding the addition of two matrices
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
for(int k=0;k<3;k++)
result[i][j]=result[i][j]+(matrix1[i][k]+matrix2[k][j];
}
}

//loop for display the result array
for(int i=0;i<3;i++){
for(int j=0;j<3;j++)
System.out.print(result[i][j]);
System.out.println();}


}
}
