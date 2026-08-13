import java.util.*;
public class Multiplcation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be Multiplied :" );
        int m = sc.nextInt();
        System.out.println("Enter the number to times :" );
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println("Table : "+m+" * " + n +" = "+(m*i));
            i++;
        }                
    }
}
