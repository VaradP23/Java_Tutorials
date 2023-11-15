import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a,b,temp;
        System.out.println("Enter two values to Swap:");
        System.out.println("Enter First No to Swap:");
        a=sc.nextInt();
        System.out.println("First No to Swap is:" +a);
        System.out.println("Enter Second No to Swap:");
        b=sc.nextInt();
        System.out.println("Second No to Swap is:"+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Value of First No After Swapping:"+a);
        System.out.println("Value of Second No After Swapping:"+b);
    }
}
