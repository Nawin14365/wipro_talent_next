import java.util.Scanner;
public class last_digit {
    static int single_digit(int num){
        if (num<10 && num>-10){
            return -1;
        } else {
            if (num>=10){
                return num%10;
            }
            if (num<=-10){
                return num%-10;
            }
        }
        return num;
    }
    public static void main(String[] args){
        Scanner run = new Scanner(System.in);
        int num = run.nextInt();
        System.out.println(single_digit(num));
    }
}
