package developers_example.bad_approach;

public class Program {


    public static void main(String[] args) {
        // даный клас являеться клиентом
        // скажем нам необходимо написать програму на каком то языке (Java, Python)
        // для этого нужно сделать следующие
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.writeJavaCode();

        //но что если теперь скажем програму нужно написать на другом языке
        // тогда изенение нужно делать тут, в самом клиенте
        PythonDeveloper pythonDeveloper = new PythonDeveloper();
        pythonDeveloper.writePythonCode();

    }


}
