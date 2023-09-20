import java.util.Scanner;

/**
 * @author Juan Jose Miranda
 */
public class Main {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        String n = lee.nextLine();
        int t = Integer.parseInt(n);
        for (int i = 0; i < t; i++) {
            String a = lee.nextLine();
            String c = "";
            int r = a.length();
            for (int j = r - 1; j >= 0; j--) {
                char x = a.charAt(j);
                c = c + x;
            }
            System.out.println(c);
        }
    }
}