import java.util.Scanner;
public class greater_number {
    public static void main(String[] args){
        System.out.println("enter your first number");
        Scanner run = new Scanner(System.in);
        int num1 = run.nextInt();
        System.out.println("enter your second number");
        int num2 = run.nextInt();
        if (num1>num2){
          System.out.println(num1 + " is the greater number");
        }
        else {
            System.out.println(num2 + " Is the greatest number");
        }
    }
}
