import java.util.Scanner;

/**
 * @author Juan Jose Miranda
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = "";

        for (int i = 0; i < s1.length(); i++) {
            s2 = s1.charAt(i) + s2;
        }

        if (s1.equals(s2)) {
            System.out.println("es palindromo");
        } else {
            System.out.println("no es palindromo");
        }
    }
}