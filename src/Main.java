import java.util.Scanner;

/**
 * @author Juan Jose Miranda
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese t");
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int panes = scanner.nextInt();
            int bollos = scanner.nextInt();
//            if (panes < bollos) {
//                System.out.println(panes);
//            } else {
//                System.out.println(bollos);
//            }

//            System.out.println(panes < bollos ? panes : bollos);

            System.out.println(Math.min(panes, bollos));
        }
    }
}