package terminal.menu;

import java.util.Scanner;

public class ReturnInput {
    public static Integer returnInput() {
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.next());
    }
}
