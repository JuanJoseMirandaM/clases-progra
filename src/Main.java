import java.util.Scanner;

/**
 * @author Juan Jose Miranda
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca dos numeros para sumarlos");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x+y);
    }
}