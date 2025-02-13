import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);// ascending number
        
        System.out.println("enter 1st number");
        int num1= scanner.nextInt();
        System.out.println("enter 2nd number");
        int num2=scanner.nextInt();
        System.out.println("enter 3rd number");
        int num3=scanner.nextInt();
        if (num1>num2) {
             int temp=num1;
            num1=num2;
            num2=temp;
            
        }
    if (num1>num3){
        int temp=num1;
        num1=num3;
        num3=temp;

    }if(num2>num3){
        int temp=num2;
        num2=num3;
        num3=temp;

    }System.out.println("number in ascending order :" +num1+",  "+num2+","+num3);

    scanner.close();
}
}

            
        
            
        
    
    

