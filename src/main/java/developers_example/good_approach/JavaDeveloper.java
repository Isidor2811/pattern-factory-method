package developers_example.good_approach;

public class JavaDeveloper implements Developer {

    //имплементируем интерфейс Developer и переопределяем метод writeCode

    @Override
    public void writeCode() {
        System.out.println("Writing java code...");
    }
}
