public class Student {

    String name;
    int age;
    String address;

    public Student(String name, int age, String address){
        this.name = name;
        this.age= age;
        this.address= address;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age= age;
    }

    public void setAddress(String address){
        this.address= address;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    public String toString(){
        return ("Student name is "+ this.getName() + ", age is " + this.getAge()
        + ", student address is  "+ this.getAddress());
    }

    public static void main(String args[]){
        Student s1= new Student("John",19,"123 test1");
        System.out.println(s1.toString());
    }
}