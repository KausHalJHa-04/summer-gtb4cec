import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        n = sc.nextInt();
        for (int i = n; i >= 1; i--) {

            for (int k = 1; k <= (n - i); k++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(" * ");
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {

            for (int k = 0; k <= (n - i); k++) {
                System.out.print("   ");
            }
            for (int j1 = 1; j1 <= i; j1++) {
                System.out.print(" * ");

            }
            for (int j2 = 1; j2 <= i - 1; j2++)
                System.out.print(" * ");
            System.out.println();

        }

        for (int i = n; i >= 1; i--) {

            for (int k = 0; k < (n - i); k++) {
                System.out.print("   ");
            }
            for (int j1 = 1; j1 <= i; j1++) {
                System.out.print(" * ");
            }
            for (int j2 = 1; j2 <= i - 1; j2++)
                System.out.print(" * ");
            System.out.println();

        }

        


        
           
            for (int i=n-4; i>=1; i--){
                for (int j=1; j<=i; j++){
                    System.out.print("* ");
            }
            for (int k=4; k<=n-i; k++){
                        System.out.print("  ");
            }
            for (int k=4; k<=n-i; k++){
                System.out.print("  ");}
                for (int j=1; j<=i; j++){
                            System.out.print("* ");
                    }
    
            System.out.println("");
        }
        System.out.println("");
    
        for (int i=1; i<=n-4; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
        }
        for (int k=4; k<=n-i; k++){
                    System.out.print("  ");
        }
        for (int k=4; k<=n-i; k++){
            System.out.print("  ");}
            for (int j=1; j<=i; j++){
                        System.out.print("* ");
                }
    
        System.out.println("");
    }
    


    for (int i = 1; i <= n-4; i++) {
        for (int k = 1; k <= n - i; k++) {
            System.out.print("  ");
        }
        for (int j1 = 1; j1 <= i; j1++) {
            System.out.print("* ");

        }
        for (int j2 = 2; j2 <= i; j2++) {
            System.out.print("* ");

        }
        System.out.println();

    }
    for (int i = n-3; i >=1; i--) {
        for (int k = 1; k <= n - i; k++) {
            System.out.print("  ");
        }
        for (int j1 = 1; j1 <= i; j1++) {
            System.out.print("* ");

        }
        for (int j2 = 2; j2 <= i; j2++) {
            System.out.print("* ");

        }
        System.out.println();

    }



    for (int i = n - 3; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        for (int k = 4; k <= n - i; k++) {
            System.out.print("  ");
        }
        for (int k = 4; k <= n - i; k++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        System.out.println("");
    }
    

    for (int i = 1; i <= n - 3; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        for (int k = 4; k <= n - i; k++) {
            System.out.print("  ");
        }
        for (int k = 4; k <= n - i; k++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        System.out.println("");
    }

    for (int i = 1; i <= n ; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        for (int k = 1; k <= n - i; k++) {
            System.out.print("  ");
        }
        for (int k = 2; k <= n - i; k++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i && j<n; j++) {
            System.out.print("* ");
        }

        System.out.println("");
    }



    for (int i = 1; i <= n; i++) {
        for (int k = 1; k <= n - i; k++) {
            System.out.print("  ");
        }
        for (int j1 = 1; j1 <= i; j1++) {
            System.out.print("1 ");

        }
        for (int j2 = 2; j2 <= i; j2++) {
            System.out.print("1 ");

        }
        System.out.println();

    }



    int count=1;
        
    for (int i = 1; i <= n; i++) {
        for (int k = 1; k <= (n - i); k++) {
            System.out.print("   ");
        }
        
        for (int j = 1; j <= i; j++) {
            if(count<10){
            System.out.print(count + "  ");
            }
            else{
                System.out.print(count + " ");
            }
            count++;
        }
       
        for (int j = 1; j <= i - 1; j++) {
            if(count<10){
                System.out.print(count + "  ");
                }
                else{
                    System.out.print(count +" ");
                }
            count++;
        }
        System.out.println();
        
    }



    
        
    for (int i = 1; i <= n; i++) {
        for (int k = 1; k <= (n - i); k++) {
            System.out.print("   ");
        }
        
        for (int j = 1; j <= i; j++) {
            if(count<10){
            System.out.print(count + "  ");
            }
            else{
                System.out.print(count + " ");
            }
            count++;
        }
       
        for (int j = 1; j <= i - 1; j++) {
            if(count<10){
                System.out.print(count + "  ");
                }
                else{
                    System.out.print(count +" ");
                }
            count++;
        }
        System.out.println();
        
    }
        
    }
    }
    



        





    
    
    
    
    
