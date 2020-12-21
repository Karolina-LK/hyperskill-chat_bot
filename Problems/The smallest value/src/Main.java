import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        long i;
        long factorial = 1;
        for (i = 1; i <= input; i++) {
            factorial = factorial * i;
            if (factorial > input) {
                System.out.println(i);
                break;
            }
        }
    }
}