import java.util.Scanner;
public class Type_of_number {
    public static void main(String[] args){
        System.out.println("Please enter your number");
        Scanner run = new Scanner(System.in);
        int num = run.nextInt();
        if (num >0){
            System.out.println("It's a positive number");
        }
        if (num<0){
            System.out.println("It's a negative number");
        }
        if (num==0){
            System.out.println("It's a Zero");
        }
    }
}
