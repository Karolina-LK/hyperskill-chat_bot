import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int noBridge = scanner.nextInt();
        int i = 1;
        String result = " ";


        while ((scanner.hasNext()) && i < noBridge) {
            int bridgeHeight = scanner.nextInt();
            if (busHeight < bridgeHeight) {
                result = "Will not crash";

            } else if (busHeight >= bridgeHeight) {
                result = "Will crash on bridge " + i;
                break;
            }
            i++;
        }
        System.out.println(result);
    }
}