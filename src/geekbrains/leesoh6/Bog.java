package geekbrains.leesoh6;

public class Bog  extends animals {

    public Bog(String name, int age , int bug) {
        this.name = name;
        this.age = age;
         this.bog = bug;
    }
    public void toswim(){

        System.out.println(name + " проплыл  " + " " + bog + "м");
    }
}
