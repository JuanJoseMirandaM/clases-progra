import java.util.Scanner;

/**
 * @author Juan Jose Miranda
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = t % 60;
        t = t / 60;
        int m = t % 60;
        int h = t / 60;
        System.out.printf("%02d:%02d:%02d\n", h, m, s);

        if (h < 10) {
            System.out.print("0" + h + ":");
        } else {
            System.out.print(h + ":");
        }

        if (m < 10) {
            System.out.print("0" + m + ":");
        } else {
            System.out.print(m + ":");
        }

        if (s < 10) {
            System.out.print("0" + s);
        } else {
            System.out.print(s);
        }
    }
}