import ru.sbrf.chat.util.Animal;
import ru.sbrf.chat.util.Cat;
import ru.sbrf.chat.util.Dog;

public class Main {
    public static void main(String[] args) {
        final Cat cat = new Cat("Barsik", "white");
        cat = new Cat("Барсик", "white");
        cat.setWeight((byte) 36); // Модификатор final блокирует изменение переменной.
        // Но не параметры конкретного объекта

        final int[] mas = new int[]{3, 5, 6, 3, 54, 6};
        mas = new int[]{2, 5, 32, 5};

        mas[2] = 13; // С массивами аналогично. Блокируем сам массив,
        // но не его конкретные эллементы


    }
}