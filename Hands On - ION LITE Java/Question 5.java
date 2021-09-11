import java.lang.*;
import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i += 2)
            System.out.print(str.charAt(i));
    }
}
