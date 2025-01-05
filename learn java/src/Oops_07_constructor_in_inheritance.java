class Base{
    Base(){
        System.out.println("this is default constructor of Base");
    }
    Base(int x){
        System.out.println("this is overloaded constructor of Base having value  x : "+x);
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("this is default constructor of Derived class");
    }
    Derived(int x,int y){
        super(x);
        System.out.println("this is overLoaded constructor of derived having valur y : "+y);
    }
}

class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("this is default of constructor of chidOfDerived");
    }

    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("this is over loaded constructor of ChildOfDerived ");
    }
}
public class Oops_07_constructor_in_inheritance {
    public static void main(String[] args) {
//        Base b = new Base();
//        Derived d = new Derived();
//        ChildOfDerived cod = new ChildOfDerived();


//                Base b = new Base(22);
//        Derived d = new Derived(33,55);
        ChildOfDerived cod = new ChildOfDerived(44,22,33);
    }
}

