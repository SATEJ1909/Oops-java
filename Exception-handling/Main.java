class invalidException  extends Exception{
    public invalidException(String msg){
        super(msg);
    }
}


public class Main {
    static void validate(int age) throws invalidException{
        if(age < 18){
            throw new invalidException("age cannot be less than 18");
        }
        System.out.println("Welcome to my house....");
    }
    public static void main(String[] args) {
        try {
            validate(188);
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
