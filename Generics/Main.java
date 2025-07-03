class GenericExample<T>{
    T obj ;

    GenericExample(T obj){
        this.obj = obj ;
    }
    void DisplayType(){
        System.out.println("Type : " + obj.getClass().getName());
    }
}



public class Main {
    public static void main(String[] args) {
        GenericExample<Integer> intObj = new GenericExample<>(16);
        GenericExample<String> stringObj = new GenericExample<>("Satej");

        intObj.DisplayType();
        stringObj.DisplayType();
    }
}
