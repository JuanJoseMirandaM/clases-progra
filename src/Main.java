import java.util.Scanner;

/**
 * @author Juan Jose Miranda
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String inv = "";
            for (int j= 0; j < s.length(); j++) {
                inv = s.charAt(j) + inv;
            }
            System.out.println(inv);
        }
    }
}