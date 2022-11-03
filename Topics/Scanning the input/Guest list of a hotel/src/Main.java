import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String[] strings = new String[4];
        strings[3] = scanner.next();
        strings[2] = scanner.next();
        strings[1] = scanner.next();
        strings[0] = scanner.next();

        for (String i : strings) {
            System.out.println(i);
        }
    }
}