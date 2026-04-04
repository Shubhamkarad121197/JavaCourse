class Employee{
    private int id;
    private String name;
    private double salary;

    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeEncapsulation {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setId(342);
        emp.setName("Shubham");
        emp.setSalary(95600);

        System.out.println("Hello I am "+emp.getName()+"\n"+"My Employee id is:"+emp.getId()+"\nand I am Earning:"+emp.getSalary()+"Per month");
    }
    
}
