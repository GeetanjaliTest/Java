public class Employee {

    String name;
    int id;
    double  salary;
    String designation;

    public Employee(String name, int id, double salary, String designation){
        this.name = name;
        this.id = id;
        this.salary= salary;
        this.designation= designation;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }

    public String getDesignation(){
        return designation;
    }

    public String toString(){
        return ("Employee details are:" + "\n Name: "+ this.getName() +
                "\n Id: "+ this.getId() + "\n Salary: "+ this.getSalary() +
    "\n Designation: "+ this.getDesignation());
    }

    public static void main(String args[]){
        Employee e1= new Employee("john",1231,150000,"software engineer");
        System.out.println( e1.toString());
    }

}
