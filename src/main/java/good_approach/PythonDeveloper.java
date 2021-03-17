package good_approach;

public class PythonDeveloper implements Developer {

    //имплементируем интерфейс Developer и переопределяем метод writeCode

    @Override
    public void writeCode() {
        System.out.println("Writing python code...");
    }

}
