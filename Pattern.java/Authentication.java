
import java.util.Scanner;


public class Authentication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the n : ");
        int n = scanner.nextInt();
    }

    public static void PrintingPatter(int n){
       
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.println(i);
            }
        }
    }
}