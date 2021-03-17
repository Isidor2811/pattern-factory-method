package developers_example.good_approach;

public class Program {

    public static void main(String[] args) {

        // и теперь в классе клиенте не будет не каких изменений (просто входящий параметр)
        Developer developer1 = DeveloperFactory.giveMeDeveloper(Language.JAVA);
        developer1.writeCode();

    }

}
