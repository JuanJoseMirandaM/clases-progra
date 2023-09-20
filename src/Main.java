import java.util.Scanner;

/**
 * @author Juan Jose Miranda
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            for (int j = 1; j <= x; j++) {
                if (x % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}