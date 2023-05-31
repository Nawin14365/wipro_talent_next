import java.util.Scanner;
public class Even_or_Odd {
    public static void main(String[] args){
        System.out.println("please enter your number");
        Scanner run = new Scanner(System.in);
        int num = run.nextInt();
        if (num%2==0){
            System.out.println("It's a even number");
        }
        else {
            System.out.println("It's a odd number");
        }
    }
}
