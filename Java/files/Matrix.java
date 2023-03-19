package files;
import java.util.Scanner;
public class Matrix{
    int arr[][];
    Matrix(int size){
        arr= new int[size][size];
        
    }
    public void initMatrix(){
        Scanner s= new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
                System.out.print("Enter Element A["+(i+1)+"]["+(j+1)+"]: ");
                arr[i][j]=s.nextInt();

            }
        }
        s.close();
    }
   public double findDeterminant(){
    int detMatrix [][];
    double det=0.0;
    double pos=0.0;
    double neg=0.0;
 if (arr.length==2)
     {
        det= (arr[0][0]*arr[1][1])-(arr[0][1]*arr[1][0]);
        return det;
     }
 else{
 detMatrix= new int[5][5];
  int t1=0;
  int t2=0;
    for (int i = 0; i < detMatrix.length; i++) {
        for (int j = 0; j <detMatrix.length; j++) {
           detMatrix[i][j]=arr[t1][t2];
           t1++;
           t2++;
    }
          
    }
t1=4;
t2=4;
    for (int i = 0; i < detMatrix.length; i++) {
        for (int j = 0; j < detMatrix.length; j++) {
           if(i==j)
        }
     
    }
           return 0.0;
    }
}}