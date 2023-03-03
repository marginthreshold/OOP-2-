package terminal.menu;

import java.util.Scanner;

import static terminal.command.ParseCommand.parseToInt;
import static terminal.messages.ExceptionMessage.parsingExceptionMessage;

public class ReRequestMenuLine {
    public static Integer returnCorrectMenu(int command, int limitNumbers) {
        Scanner sc = new Scanner(System.in);
        while (command == -1) {
            try {
                command = parseToInt(sc.next());
                if (command > limitNumbers) {
                    System.out.println("В меню меньше пунктов, порпобуйте еще раз");
                    command=-1;
                }
            } catch (Exception e) {
                parsingExceptionMessage();
                command = -1;
            }
        }

        return command;
    }
}
