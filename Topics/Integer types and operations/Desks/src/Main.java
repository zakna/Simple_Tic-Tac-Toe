import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double a = scanner.nextInt();
        a = (double) Math.ceil(a / 2);

        double b = scanner.nextInt();
        b = (double) Math.ceil(b / 2);

        double c = scanner.nextInt();
        c = (double) Math.ceil(c / 2);

        int classroom = (int) (a + b + c);
        System.out.println(classroom);
    }
}
