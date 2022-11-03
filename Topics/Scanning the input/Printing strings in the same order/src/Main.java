import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Stream operations (forEach is a "terminal" operation)
        // and lambda expressions/method references.
        // tokens() will produce a stream of strings from the scanner,
        // and the forEach method will apply the println method on each string
        scanner.tokens().limit(4).forEach(System.out::println);
            }
}