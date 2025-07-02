abstract class Animal {
    void eat(){
        System.out.println("Animals are eating......");
    }

    abstract void sound() ;
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dogs are barking......");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cats are meowing.....");
    }
}


public class Main {
    public static void main(String[] args) {
         Cat c = new Cat();
         c.eat();
         c.sound();

         Dog d = new Dog();
         d.eat();
         d.sound();
    }
}
