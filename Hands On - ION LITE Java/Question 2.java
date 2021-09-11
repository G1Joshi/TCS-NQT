import java.lang.*;
import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int v = 0, c = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (isVowel(ch))
                    v++;
                else
                    c++;
            }
        }
        System.out.println("Number of Vowels: " + v);
        System.out.println("Number of Consonants: " + c);
    }

    static boolean isVowel(char ch) {
        switch (ch) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
