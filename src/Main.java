import java.util.Scanner;

/**
 * @author Juan Jose Miranda
 */
public class Main {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int n = lee.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            int x = lee.nextInt();
            vector[i] = x;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }
    }
}