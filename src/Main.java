import java.util.Scanner;

/**
 * @author Juan Jose Miranda
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca tres numeros");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int max = Math.max(x, Math.max(y, z));
        System.out.println(max);
    }
}