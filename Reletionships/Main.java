import.java.util.*;
//Aggregation

import java.util.ArrayList;
import java.util.List;

class Department{
    
  private List<Employee> emp ;

  public Department(List<Employee> emp){
       this.emp = emp ;
   }
}

class Employee{
    private String name;
    
    public Employee(String name){
        this.name = name ;
    }
}



//composition

class House {
    private List<Room> rooms;

    public House() {
        rooms = new ArrayList<>();
        rooms.add(new Room("Living Room"));
        rooms.add(new Room("Bedroom"));
    }
}

class Room{
    private String name ;

    Room(String name){
        this.name = name ;
    }
}
class Main{
    public static void main(String[] args) {
        
    }
}