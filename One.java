import java.util.Scanner;
public class One{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // taking input from user
        System.out.println("enter 1st number");
        int num1 = scanner.nextInt();
        System.out.println("enter 2nd number");
        int num2=scanner.nextInt();
        //finding and printing greatest number
        if (num1>num2) {
            System.out.println(num1 +" is greater");

            
        }else if (num2>num1) {
            System.out.println(num2 +"is greater");
            
        }else{
            System.out.println("both are equal");
        }
        scanner.close();

    }
    
}
