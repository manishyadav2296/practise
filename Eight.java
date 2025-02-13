import java.util.Scanner;
public class Eight {
public static void main(String[] args) {
    Scanner scanner=new  Scanner(System.in);
    System.out.println("enter 1st number");
    int num1= scanner.nextInt();
    System.out.println("enter 2nd number");
    int num2= scanner.nextInt();
    System.out.println("enter 3rd nuber");
    int num3= scanner.nextInt();
   int greatest = num1;
   if (num2>greatest) {
    greatest=num2;
    
   }
   if (num3 >greatest) {
    
   }
   System.out.println("The greatest number is:" +greatest);
    
    scanner.close();
}
}
    

