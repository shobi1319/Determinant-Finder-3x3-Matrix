package files;
import java.util.Scanner;
public class Main{

  

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.println("Enter size of Matrix only 2x2 or 3x3");
    System.out.println("1. 2x2 Matrix");
    System.out.println("2. 3x3 Matrix");
    int choice= sc.nextInt();
    Matrix m1;
  while(true){
    if (choice==1)
   {
    m1 = new Matrix(2);
    m1.initMatrix();
    break;
   }
   else if(choice ==2)
   {
    m1 = new Matrix(3);
    m1.initMatrix();
    break;
   }
   else
   System.out.println("try again");
  }
    
System.out.println("Determinant is: "+m1.findDeterminant());
    sc.close();
}
}
