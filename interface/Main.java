interface Animal{
    void eat();
    void run();
}

class Dog implements Animal{
    
    public void run(){
        System.out.println("Running......");
    }

    public void eat(){
        System.out.println("Eating.....");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog  d = new Dog();
        d.eat();
        d.run();
    }
}
