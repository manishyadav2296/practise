import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
    System.out.println("enter the number");
    int num= scanner.nextInt();
    if (num%2==0) {
        System.out.println("even number");
        
    }else{
        System.out.println("odd");
    }
    scanner.close();
        
    }
    
}
