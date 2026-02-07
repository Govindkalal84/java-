
/*/ * 
   **
  ***
 ****/
import java.util.Scanner;

class TrianglePattern{

    public static void main(String args[])
    {
           Scanner sc= new Scanner(System.in);
           System.out.println("enter the size");
           int n=sc.nextInt();
           trianglepattern(n);

    }
          
        static void trianglepattern(int n){

              for(int i=1;i<=n;i++) {

                for(int s=1;s<=n-i;s++){

                    System.out.print(" ");
                }

              for(int j=1;j<=i;j++)
              {
                
                System.out.print("*");

              }


              System.out.println();
              
              
            }

        

    }

}