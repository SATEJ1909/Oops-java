
class Animal{
    void eat(){
        System.out.println("Eating......");
    }
}
//multilevel inheritance
// class Mammel extends Animal {
//     void run(){
//         System.out.println("Running......");
//     }
// }

// class Dog extends Mammel{
//     void bark(){
//         System.out.println("Barking....");
//     }
// }

class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Meowing...");
    }
}
public class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}