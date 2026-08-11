import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no to be factorial : ");
        int n = sc.nextInt();
        int F = 1;
        for(int i = 2;i<=n;i++){
            F=F*i;
        }
            System.out.println("Factorial :"+F);

    }    
}
