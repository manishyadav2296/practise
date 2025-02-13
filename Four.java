import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num = scanner.nextInt();
        if (num>0) {
            System.out.println("number is posituve");
            
        }else{
            System.out.println("negative");
        }
        scanner.close();
    }
    
}
