import java.util.Scanner;
public class even_func {
    static int even(int num){
        if (num%2==0){
            return 2;

        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
        System.out.println("Please enter your number");
        Scanner run = new Scanner(System.in);
        int num = run.nextInt();
        System.out.println(even(num));
    }
}
