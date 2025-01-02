class Employe{
    int salary;
    public int getSalary(){
        return salary;
    }
    String name;
    public String getName(){
        return name;
    }
    public void setName(String nameSetter){
        name=nameSetter;
    }
}


public class Oops_02 {
    public static void main(String[] args) {
Employe e = new Employe();
e.salary=234567;
e.name="testingggggg";
String name = e.getName();
        System.out.println(name);
        e.setName("Test");
        System.out.println(e.name);

    }
}
