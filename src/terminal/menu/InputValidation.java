package terminal.menu;

import java.util.Scanner;

import static terminal.messages.ExceptionMessage.parsingExceptionMessage;

public class InputValidation {
    public static Integer returnCorrectMenuNumber(int min,int max) {
        Scanner sc = new Scanner(System.in);
        int command = -1;
        while (command == -1 || command > max) {
            try  {
                command = Integer.parseInt(sc.next());
                if (command > max) {
                    System.out.println("Значение должно быть не больше "+max+", попробуйте ввести еще раз");
                    command = -1;
                } else if (command < min) {
                    System.out.println("Значение должно быть не меньше "+min+" ,попробуйте ввести еще раз");
                    command = -1;
                }
            } catch (Exception e) {
                parsingExceptionMessage();
                command = -1;
            }
        }

        return command;
    }
}
