package terminal.menu;


public class CommandMenu {
    public static void chooseAddDelMenu(){
        System.out.println("\nВведите цифру, чтобы добавить или удалить животное из клетки:");
        System.out.println(
                "1 - Добавить Животное в клетку\n2 - Удалить животное из клетки\n3 - Выход");
    }

    public static void chooseAnimalMenu(){
        System.out.println("\nВведите цифру для выбора животного:");
        System.out.println(
                "1 - Лев \n2 - Волк \n3 - Змея");
    }
    public static void requestAdditionalParameterMenu(int animal) {
        switch (animal) {
            case 1:
                System.out.println("Введите размер гривы льва");
                break;
            case 2:
                System.out.println("Введите уровень свирепости волка");
                break;
            case 3:
                System.out.println("Введите длину тела змеи");
                break;
        }
    }

    public static void requestAnimalAgeMenu(){
        System.out.println("Введите возраст животного");
    }
    public static void requestAnimalWeightMenu(){
        System.out.println("Введите вес животного");
    }
    public static void requestAnimalCountLimbsMenu(){
        System.out.println("Введите количество конечностей животного");
    }


}
