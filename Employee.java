public class Employee{
    
    // Attribute 
    private String id;
    private String name;
    private Double salary;
    
    //Static Attribue 
    static int minSalary=12000;

    //Default Constructor
    public Employee(){

    }
    public Employee(String id,String name){
    }
    public Employee(String name,Double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    } 

    //Method
    public void setID(String id){
         this.id=id;

    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(Double salary){
        this.salary=salary;
    }

    public void displayEmployee(){
        
            System.out.println("ID = "+this.id);
            System.out.println("Name = "+this.name);
            System.out.println("Salary = "+this.salary);
    }

    public String getName(){
        return this.name;
    }
    public Double getSalary(){
        return this.salary;
    }
}
