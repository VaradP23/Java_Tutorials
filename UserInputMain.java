import java.util.Scanner;

public class UserInputMain {
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
     /*   String firstStr = sc.nextLine();
        System.out.println("You entered:" +firstStr);

        int a = sc.nextInt();
        System.out.println("You entered:" +a); */

        System.out.println("Hello, What's your name?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "\t What's up!");

        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("You are :" +age + "\t years old.");
    }
}
