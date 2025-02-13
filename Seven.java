import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter ist number");
        int num1=scanner.nextInt();
        System.out.println("enter 2nd number");
        int num2=scanner.nextInt();
        if (num1>num2) {
            System.out.println("num1 is greater");
            
        }else if (num2>num1) {
            System.out.println("num2 is graeter");
            
        }else{
            System.out.println("equal");
        }
        scanner.close();
        
    }
    
}
