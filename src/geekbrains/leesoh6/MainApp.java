package geekbrains.leesoh6;

public class MainApp {
    public static void main(String[] args ){
        Cat cat = new Cat("Барсик", 3 , 200);
        cat.Info();
        cat.jumn();
        cat.not();



        Bog bog = new Bog("Рокки", 5 , 500);
        bog.Info();
        bog.jumn();
        bog.toswim();


    }
}
