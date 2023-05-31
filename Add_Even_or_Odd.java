import java.util.Scanner;
public class Add_Even_or_Odd {
    public static void main(String[] args){
        System.out.println("please enter your numbers");
        Scanner run = new Scanner(System.in);
        int num1 = run.nextInt();
        int num2 = run.nextInt();
        int num = num1+num2;
        if (num%2==0){
            System.out.println("It's a even number");
        }
        else {
            System.out.println("It's a odd number");
        }
    }
}
