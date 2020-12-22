package bot;

import java.util.Scanner;

public class SimpleBot {
    private static final int CORRECT = 2;

    public static void showMessage(String text){
        System.out.println(text);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        showMessage("Hello! My name is Aid.");
        showMessage("I was created in 2020.");
        showMessage("Please, remind me your name.");

        String name = scanner.nextLine();

        showMessage("What a great name you have, " + name + "!");
        showMessage("Let me guess your age.");
        showMessage("Enter remainders of dividing your age by 3, 5 and 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        showMessage("Your age is " + age + "; that's a good time to start programming!");
        showMessage("Now I will prove to you that I can count to any number you want.");

        int providedNo = scanner.nextInt();
        int i = 0;
        while (i <= providedNo) {
            showMessage(i + "!");
            i++;
        }

        showMessage("Let's test your programming knowledge.");
        showMessage("Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.");
        String resultNeg = "Please, try again.";
        while(scanner.hasNext()) {
            int answer = scanner.nextInt();

            if (answer == CORRECT) {
                showMessage("Congratulations, have a nice day!");
            } else {
                showMessage(resultNeg);
            }

//            if (answer == 1) {
//                showMessage(resultNeg);
//            } else if (answer == 2) {
//                showMessage("Congratulations, have a nice day!");
//                break;
//            } else if (answer == 3) {
//                showMessage(resultNeg);
//            } else if (answer == 4) {
//                showMessage(resultNeg);
//            }
        }
    }
//    public enum Answer{
//        WRONG1(1), CORRECT2(2), WRONG3(3), WRONG4(4);
//        private int id;
//
//        Answer(int id) {
//            this.id = id;
//        }
//
//        public int getId() {
//            return id;
//        }
//    }
}
