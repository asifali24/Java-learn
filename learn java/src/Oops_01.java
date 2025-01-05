class Employee{
    int id;
    String name;
    String dep;
    public void printDetails(){
        System.out.printf("the id is %d and name is %s",id,name);
    }
}
public class Oops_01 {

    public static void main(String[] args) {
        Employee e= new Employee();
        e.id=2;
        e.name="QWERT";
        e.printDetails();
    }
}


