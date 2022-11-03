import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numberOfGrades = scanner.nextInt();
        int a = 0, b = 0, c = 0, d = 0;
        for (int i = 0; i < numberOfGrades; i++) {
            String grade = scanner.next();
            if (grade.equals("A")) {
                a++;
            }
            if (grade.equals("B")) {
                b++;
            }
            if (grade.equals("C")) {
                c++;
            }
            if (grade.equals("D")) {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}