class Employees{
String name;
int id;
int salary;

public  Employees(){
    this.name="default name";
    id = 0;
    salary=10000;
}
public Employees(String n){
    this.name=n;
    this.id = 0;
    this.salary=10000;
}
 public Employees(String n,int id,int sal){
     this.name=n;
     this.id = id;
     this.salary=sal;
 }

}
public class Oops_03_constructionOverloading_Company{
    public static void main(String[] args) {
        Employees  e = new Employees();
        System.out.println("e-----------"+e.name);
        System.out.println("e-----------"+e.id);
        System.out.println("e-----------"+e.salary);

        Employees  e1 = new Employees("yest");
        System.out.println("e1-----------"+e1.name);
        System.out.println("e1-----------"+e1.id);
        System.out.println("e1-----------"+e1.salary);


        Employees  e2 = new Employees("test",2,100000);
        System.out.println("e2-----------"+e2.name);
        System.out.println("e2-----------"+e2.id);
        System.out.println("e2-----------"+e2.salary);

    }



}
