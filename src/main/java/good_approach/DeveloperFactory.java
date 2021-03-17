package good_approach;

public class DeveloperFactory {

    // создаем фабрику, которая будет ответвена за создания екземпляров обьектов, в зависимости от параметра
    // таким образом мы не делаем никаких изменений на стороне клиента если нужно добавить нового програмиста
    // просто создаем класс (C#Developer), имплементируем интерфейс, и добавляем еще одно значение в фабрику.

    public static Developer giveMeDeveloper(Language language) {
        switch (language) {
            case JAVA -> {
                return new JavaDeveloper();
            }
            case PYTHON -> {
                return new PythonDeveloper();
            }
            default -> throw new IllegalStateException("Unexpected value: " + language);
        }
    }

}
