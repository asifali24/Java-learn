class Phone {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class SmartPhone extends Phone {
    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class Oops_06_inheritance {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.setY(2);
        s.setX(33);
        System.out.println(s.getX());
        System.out.println(s.getY());
    }
}
