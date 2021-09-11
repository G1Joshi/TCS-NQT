import java.lang.*;
import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int n = 0;
        while (num > 0) {
            n = n * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reverse of the number is " + n);
    }
}
