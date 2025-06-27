//run-time polymorphism || method overloading 
class Calculator{

    public int add(int a , int b){
        return a+b;
    }

    public double add(double a , double b){
        return a+b;
    }

    public int add(int a , int b , int c){
        return a+b+c ;
    }
}

//compile-time polymorphism 

class Animal {
    public void sound(){
        System.out.println("Animals are sounding");
    }
}

class Dog extends Animal{
    
    @Override
    public void sound(){
        System.out.println("Dogs are barking.....");
    }
}

public class Main {
    public static void main(String[] args) {
          Calculator c = new Calculator();

          System.out.println(c.add(1,2,2));
          System.out.println(c.add(1,2));
          System.out.println(c.add(1.2, 2.2));


          Dog d = new Dog();
          d.sound();
    }
}
