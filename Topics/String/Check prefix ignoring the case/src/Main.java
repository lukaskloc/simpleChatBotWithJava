import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String string = scanner.nextLine();
        String prefix = "J";

        boolean startsWithJ = string.substring(0, 1).equalsIgnoreCase(prefix);

        System.out.println(startsWithJ);
    }
}