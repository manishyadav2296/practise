import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num=scanner.nextInt();
        if (num>=100 && num<=999) {
            System.out.println("number is 3 digit");

            
        }else{
            System.out.println("not");
        }
        scanner.close();
    }
    
}
