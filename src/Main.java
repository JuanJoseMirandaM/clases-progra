import java.util.Scanner;

/**
 * @author Juan Jose Miranda
 */
public class Main {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int n = lee.nextInt();
        int x = 1;
        int y = -1;

        for (int i = 1; i <= n; i++) {
            x = x * i;
            System.out.println(x * y);
            y = -y;
        }
    }
}