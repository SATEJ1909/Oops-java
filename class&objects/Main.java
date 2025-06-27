class Employee {
   private int salary ;
   public String employeeName ;

   public void setName(String s){
        employeeName = s ;
   }

   public void setSalary(int amount){
        salary = amount ;
   }

   public int getSalary(){
    return salary ;
   }
}
public class Main {
     public static void main(String[] args) {
         Employee e = new Employee();
          e.setName("satej");
          e.setSalary(10000);
          
          Employee e2 =  new Employee();
          e2.setName("Dipak");
          e2.setSalary(100000);

          System.out.println("Salary of " + e.employeeName + "  is " +  e.getSalary());
          System.out.println("Salary of " + e2.employeeName + " is " + e2.getSalary());

     }
}