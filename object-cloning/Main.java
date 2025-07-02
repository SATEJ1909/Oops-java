//shalow-cloning
// class Address{
//      String name ;

//     Address(String name){
//         this.name = name ;
//     }
// }

// class Person implements Cloneable{
//     String name ;
//     Address address ;

//     Person(String name , Address address){
//         this.name = name ;
//         this.address = address ;
//     }

//     @Override
//     protected Object clone() throws CloneNotSupportedException{
//         return super.clone();//shalow-copy
//     }
// }


//Deep-copy


class Address implements Cloneable{
    String city ;

    Address(String city){
        this.city = city ;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return new Address(this.city);
    }
}

class Person implements Cloneable{
    String name ;
    Address address ;

    Person(String name , Address address){
        this.name = name ;
        this.address = address ;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clonePerson = (Person) super.clone();
        clonePerson.address = (Address) address.clone();
        return clonePerson ;
    }
}
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Pune");
        Person person = new Person("Satej" ,address);

        Person clonedPerson = (Person) person.clone();

        clonedPerson.address.city = "Mumbai" ;

        System.out.println(person.name + " lives in " + person.address.city);  // Pune 
        System.out.println(clonedPerson.name + " lives in " + clonedPerson.address.city); // Mumbai
    }
}
