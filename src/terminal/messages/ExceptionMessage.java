package terminal.messages;

public class ExceptionMessage {
    public static void parsingExceptionMessage() {
        System.out.println("Введенная команда не является числом");
    }
    public static void menuExceptionMessage(){
        System.out.println("Вы вышли из меню!");
    }

    public static void menuExceptionMaxValue(int max){
        System.out.println("Значение должно быть не больше "+max+", попробуйте ввести еще раз");
    }
    public static void menuExceptionMinValue(int min){
        System.out.println("Значение должно быть не меньше "+min+", попробуйте ввести еще раз");
    }

}
