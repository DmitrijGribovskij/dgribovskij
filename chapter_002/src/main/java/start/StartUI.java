package start;


import models.Comment;
import models.Item;
import java.util.Date;
import java.util.List;

/**
 * Class StartUI.
 * @author Dmitrij Gribovskij.
 * @since 21.12.2016.
 */
public class StartUI {
    /**
     * Цифра 1 для создания заявки.
     */
    private final int numberOne = 1;
    /**
     * Цифра 2 для поиска заявки по ID.
     */
    private final int numberTwo = 2;
    /**
     * Цифра 3 для поиска заявки по имени.
     */
    private final int numberThree = 3;
    /**
     * Цифра 4 для поиска заявки по описанию.
     */
    private final int numberFour = 4;
    /**
     * Цифра 5 для просмотра всех заявок.
     */
    private final int numberFive = 5;
    /**
     * Цифра 6 для удаления заявки.
     */
    private final int numberSix = 6;
    /**
     * Цифра 7 для добавления комментариев к заявке.
     */
    private final int numberSeven = 7;
    /**
     * Цифра 8 для выхода из программы.
     */
    private final int numberEight = 8;
    /**
     * Создание ссылки на объект наследуемого от интерфейса Input.
     */
    private Input input;
    /**
     * Конструктор класса StartUI.
     * @param input - ссылка на объект.
     */
    public StartUI(Input input) {
        this.input = input;
    }
    /**
     * Создание объекта класса Tracker.
     */
    private Tracker tracker = new Tracker();
    /**
     * Main.
     * @param args - args.
     */
        public static void main(String[] args) {
            StartUI startUI = new StartUI(new ConsoleInput());
            startUI.menu();
            startUI.selection();
    }
    /**
     * Метод который провярет допустимость значений введеных пользователем.
     * @return - int число выбранное пользователем.
     */
    public int init() {
        System.out.println("");
        String str = this.input.ask("Сделайте Ваш выбор: ");
        int result;
        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число!");
            System.out.println("Попробуйте еще раз");
            result = init();
        }
        if (result < numberOne || result > numberEight) {
            System.out.println("Введите число в диапазаное от 1 до 8");
            result = init();
        }
            return result;
        }
    /**
     * Метод в котором пользователь делает выбор.
     */
    public void selection() {
            int input = init();
            if (input == numberOne) {
                tracker.add(new Item(this.input.ask("Введите имя заявки: "), this.input.ask("Описание заявки: "), new Date(),
                        new Comment(this.input.ask("Комментарии к заявке: "))));
            }
            if (input == numberTwo) {
                Item item = tracker.findById(this.input.ask("Введите ID заявки: "));
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Завки с таким ID нет в списке!");
                    System.out.println("Для просмотра всех заявок введите цифру 5");
                }
            }
            if (input == numberThree) {
                List<Item> items = tracker.findName(this.input.ask("Введите имя заявки: "));
                if (items.size() != 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Заявок с таким именем нет в списке!");
                    System.out.println("Для просмотра всех заявок введите цифру 5");
                }
            }
            if (input == numberFour) {
                List<Item> items = tracker.findDescription(this.input.ask("Введите описание заявки: "));
                if (items.size() != 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Заявок с таким описанием нет в списке!");
                    System.out.println("Для просмотра всех заявок введите цифру 5");
                }
            }
            if (input == numberFive) {
                List<Item> items = tracker.getAll();
                if (items.size() != 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Список заявок пуст! Для создания заявки введите цифру 1");
                }
            }
            if (input == numberSix) {
                Item item = tracker.findById(this.input.ask("Введите ID заявки, которую необходимо удалить: "));
                if (item != null) {
                    tracker.deleteItem(item);
                    System.out.println("Заявка удалена!");
                } else {
                    System.out.println("Завки с таким ID нет в списке!");
                    System.out.println("Для просмотра всех заявок введите цифру 5");
                }
            }
            if (input == numberSeven) {
                Item item = tracker.findById(this.input.ask("Введите ID заявки в которую добавить комментарий: "));
                if (item != null) {
                    tracker.addComment(item, new Comment(this.input.ask("Добавьте комментарий: ")));
                    System.out.println("Комментарий добавлен!");
                } else {
                    System.out.println("Завки с таким ID нет в списке!");
                    System.out.println("Для просмотра всех заявок введите цифру 5");
                }
            }
            if (input == numberEight) {
                String ask = this.input.ask("Если Вы уверены, что хотите выйти, то введите: Y");
                if (ask.toUpperCase().equals("Y")) {
                    System.out.println("Пока!");
                    System.exit(0);
                } else {
                    menu();
                    selection();
                }
            }
            selection();
    }
    /**
     * Метод в котором хранится меню для пользователя.
     */
    private void menu() {
            String menu = "         Меню пользователя \n"
                   + "Для создания заявки введите цифру             1 \n"
                   + "Для поиска заявки по ID введите цифру         2 \n"
                   + "Для поиска заявки по имени введите цифру      3 \n"
                   + "Для поиска заявки по описанию введите цифру   4 \n"
                   + "Для просмотра всех заявок введите цифру       5 \n"
                   + "Для удаления заявки введите цифру             6 \n"
                   + "Для добавления коментария введите цифру       7 \n"
                   + "Для выхода из программы нажмите цифру         8";
        System.out.println(menu);
    }
}
