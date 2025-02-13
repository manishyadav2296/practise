import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num=scanner.nextInt();
        if (num%7==0) {
            System.out.println("number is divisble by 7");
            
        }else{
            System.out.println("number is not divisble by 7");
        }

scanner.close();
        
    }
    
    
}
