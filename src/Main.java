import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Scanner scanner = new Scanner(System.in);
        int askNumber = scanner.nextInt();
        System.out.println(askNumber);
        scanner.close();

    }

}