public class main {

    public static void main(String [] args) {

        Programmer p1=new Programmer();
        p1.setID("1");
        p1.setName("Programmer");
        p1.setSalary(40000.0);
        p1.displayEmployee();

        Accounting ac=new Accounting();
        ac.setID("2");
        ac.setName("Accounting");
        ac.setSalary(35000.0);
        ac.displayEmployee();

    }
    
}
