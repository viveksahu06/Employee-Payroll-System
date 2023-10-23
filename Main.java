import java.lang.reflect.Array;
import java.util.ArrayList;;
abstract class Employee{
       private String name; 
       private int id; 
       public Employee(String name,int id){
        this.name=name; 
        this.id=id; 
       } 

       public String getName(){
        return name;
       } 
       public int getId(){
        return id;
       }   

   public abstract double calculateSalary(); 

   @Override 
   public String toString(){
    return "Employee[name="+name+",id="+id+",salary="+calculateSalary()+"]";
   }  
} 

class FullTimeEmployee extends Employee { 
        private double monthlySalary;   
        public FullTimeEmployee(String name,int id,double monthlySalary){
            super(name,id); 
            this.monthlySalary=monthlySalary;
        } 
        @Override 

        public double calculateSalary(){
              return monthlySalary;
        }


} 
class PartTimeEmployee extends Employee{
  //  private double monthlySalary; 
    private int hoursWorked;  
    private double hourlyRate; 
    public PartTimeEmployee(String name,int id,int hoursWorked,double hourlyRate){
        super(name,id); 
        this.hoursWorked=hoursWorked; 
        this.hourlyRate=hourlyRate;
    } 
     @Override 
     public double calculateSalary(){
        return hourlyRate*hoursWorked;
     }
} 
class PayrollSystem{
    private ArrayList<Employee>employeeList; 
    public PayrollSystem(){
       employeeList=new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    } 
    public void removeEmployee(int id){
        Employee employeeToRemove=null; 
        for(Employee employee:employeeList){
            if(employee.getId()==id){
                employeeToRemove=employee; 
                break;
            }
        } 
        if(employeeToRemove!=null){
            employeeList.remove(employeeToRemove);
        } 
    } 

    public void displayEmployee(){
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}
public class Main{
    public static void main(String[] args) {
      PayrollSystem payrollsystem=new PayrollSystem(); 
      FullTimeEmployee emp1=new FullTimeEmployee("Vivek",101 , 70000.0);
      PartTimeEmployee emp2=new PartTimeEmployee("Alok", 201, 40, 100);
      payrollsystem.addEmployee( emp1);
      payrollsystem.addEmployee(emp2); 
      System.out.println("Initial employee Detail : ");
      payrollsystem.displayEmployee(); 
      System.out.println("Removing Employee : "); 
      payrollsystem.removeEmployee(201); 
      payrollsystem.displayEmployee();
    }
}