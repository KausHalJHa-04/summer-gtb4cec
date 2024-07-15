
import java.util.*;  


public class pattern {
       public static void main(String[] args) { 
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no n");
        n= sc .nextInt();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
            System.out.print(" * ");
            System.out.println();
        } 
           
        sc.close();
    }
}
