import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int grade = 0;
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;


        for (int i = 0; i < n; i++) {
            grade = scanner.nextInt();
            if (grade == 2) {
                d++;
            } else if (grade == 3) {
                c++;
            } else if (grade == 4) {
                b++;
            } else if (grade == 5) {
                a++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}