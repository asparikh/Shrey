// written by parik081

public class Quadratic {
    private float a;
    private float b;
    private float c;
    public Quadratic(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Quadratic add(Quadratic other){
        return new Quadratic((this.a + other.a), (this.b + other.b), (this.c + other.c));
    }
    public Quadratic subtract(Quadratic other){
        return new Quadratic((this.a - other.a), (this.b - other.b), (this.c - other.c));
    }
    public Roots findRoots(){
        Roots theseRoots = new Roots(this.a, this.b, this.c);
        theseRoots.getRoots();
        return theseRoots;
    }
    public String toString(){
        String strA = String.valueOf(this.a);
        String strB = String.valueOf(this.b);
        String strC = String.valueOf(this.c);
        return strA + "x^2 + " + strB + "x + " + strC;
    }
    public static void main(String[] args) {
        Quadratic quad1 = new Quadratic(9, -4, 1);
        Quadratic quad2 = new Quadratic(4, 3, 2);
        System.out.println("Printing a Quadratic (quad1) with values of 9, -4, 1 for a, b, c, respectively");
        System.out.println(quad1.toString());
        System.out.println("Printing a Quadratic (quad2) with values of 4, 3, 2 for a, b, c, respectively");
        System.out.println(quad2.toString());
        Quadratic quad3;
        Quadratic quad4;
        System.out.println("Printing the resulting Quadratic (quad3) when quad2 is added to quad1");
        quad3 = quad1.add(quad2);
        System.out.println(quad3.toString());
        System.out.println("Printing the resulting Quadratic (quad4) when quad2 is subtracted from quad1");
        quad4 = quad1.subtract(quad2);
        System.out.println(quad4.toString());
        System.out.println("Printing the roots from 'Roots' object for quad1");
        System.out.println(quad1.findRoots());
        System.out.println("Printing the roots from 'Roots' object for quad2");
        System.out.println(quad2.findRoots());
        System.out.println("Printing the roots from 'Roots' object for quad3");
        System.out.println(quad3.findRoots());
    }
}
