import java.util.Scanner;

/**
 * @author Juan Jose Miranda
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un lenguaje de programacion");
        String x = sc.nextLine();
        switch (x) {
            case "java":
                System.out.println("java$$$");
                break;
            case "python":
                System.out.println("python!!!");
                break;
            default:
                System.out.println("no tengo ese lenguaje");
                break;
        }

    }
}