import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        String input1tr = input1.replaceAll(" ", "").trim();
        String input2tr = input2.replaceAll(" ", "").trim();

        System.out.println(input1tr.equals(input2tr));
    }
}