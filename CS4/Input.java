import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);

    public static void prompt() {
        System.out.println("> 좌표를 입력하세요.");
    }

    public static String[] input() {
        return sc.nextLine().split("-");
    }
}
