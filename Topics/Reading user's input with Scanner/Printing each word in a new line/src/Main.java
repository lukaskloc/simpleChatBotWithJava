import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String[] array = new String[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}