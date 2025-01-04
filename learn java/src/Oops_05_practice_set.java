class Cylinder {
    private int rad ;
    private int height ;

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

   public  float calSurfaceArea(int r, int h) {
       System.out.println("r"+r);
       System.out.println("h"+h);
        return (float) (2 * 3.14f * r * h) + (2 * 3.14f * r * r);
    }
    public float calSurfaceArea() {
        return (float) (2 * 3.14f * rad * height) + (2 * 3.14f * rad * rad);
    }
}
class Rectangle{
    int length ;
    int height;
    public  Rectangle(){
        length = 4;
        height=5;
    }

    public  Rectangle(int l, int r){
        length = l;
        height=r;
    }
}

public class Oops_05_practice_set {
    public static void main(String[] args) {
   /*
       Cylinder c = new Cylinder();
        c.setRad(2);
        c.setHeight(5);
        float surfaceArea = c.calSurfaceArea(c.getRad(),c.getHeight() );
        float surfaceArea2 = c.calSurfaceArea();

        System.out.println("surfacr Area is  : "+ surfaceArea );
        System.out.println("surfacr2 Area is  : "+ surfaceArea2 );
*/

    Rectangle r1 = new Rectangle();
        System.out.println("r1 "+r1.height);
        System.out.println("r1 "+r1.length);


        Rectangle r2 = new Rectangle(24,6);
        System.out.println("r2 "+r2 .height);
        System.out.println("r2 "+r2.length);

    }

}
