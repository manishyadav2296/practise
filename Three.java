import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
    int num=scanner.nextInt();
    if (num% 3==0) {
        System.out.println("number is multiple of 3");
        
    }else{
        System.out.println("not");
    }
    
     scanner.close();   
    }
    
}
