import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            char word = a.charAt(i);

            if (word >= 'A' && word <= 'Z') {
                System.out.print(Character.toLowerCase(word));
            } else {
                System.out.print(Character.toUpperCase(word));
            }
        }
    }
}