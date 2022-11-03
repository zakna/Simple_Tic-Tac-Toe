import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int flight = scanner.nextInt();
        int nights = scanner.nextInt();

        int cost = (foodPerDay * days) +
                        (flight * 2) +
                (nights * (days-1));
        System.out.println(cost);
    }
}