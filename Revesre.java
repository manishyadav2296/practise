import java.util.Scanner;

public class Revesre {
    public static void main(String[] args) {
        int n,r;
        System.out.println("enter the number");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        while (n>0) {
            r=n%10;
            System.out.println("reverse order"+r);
            n=n/10;
            
        }
    }
    
}
