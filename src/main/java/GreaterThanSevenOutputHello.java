import java.util.Scanner;

public class GreaterThanSevenOutputHello {

    public static void main(String[] args) {

        String output = "Привет";
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value > 7) {
            System.out.println(output);
        }
    }
}
