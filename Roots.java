public class Roots {
    private float a;
    private float b;
    private float c;
    public double realPartAdd;
    public double realPartSubtract;
    public double imaginaryPart;
    public double imaginaryPartSubtract;

    public Roots(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.realPartAdd = 0;
        this.realPartSubtract = 0;
        this.imaginaryPart = 0;
        this.imaginaryPartSubtract = 0;
    }

    public double calculateImaginary() {
        float underSqrt = ((this.b * this.b) - (4 * this.a * this.c)); //calculating the b^2 - 4ac part of the quadratic formula
        if (underSqrt < 0) {
            float complex = (-1 * underSqrt);
            this.imaginaryPart = Math.sqrt(complex) / (2 * this.a);
        } else {
            this.imaginaryPart = 0;
        }
        return this.imaginaryPart;
    }

    public double calculateRealAdd() {
        float underSqrt = (this.b * this.b) - (4 * this.a * this.c); //calculating the b^2 - 4ac part of the quadratic formula
        float outSqrt = (-1 * this.b);
        if (underSqrt < 0) {
            this.realPartAdd = outSqrt / (2 * this.a);
        } else {
            this.realPartAdd = (outSqrt + underSqrt) / (2 * this.a);
        }
        return this.realPartAdd;
    }

    public double calculateRealSubtract() {
        float underSqrt = (this.b * this.b) - (4 * this.a * this.c); //calculating the b^2 - 4ac part of the quadratic formula
        float outSqrt = (-1 * this.b);
        if (underSqrt < 0) {
            this.realPartSubtract = outSqrt / (2 * this.a);
        } else {
            this.realPartSubtract = (outSqrt - underSqrt) / (2 * this.a);
        }
        return this.realPartSubtract;
    }
     public Complex4 constructAdd() {
        calculateImaginary();
        calculateRealAdd();
        Complex4 root1 = new Complex4(this.realPartAdd, this.imaginaryPart);
        return root1;
     }
    public Complex4 constructSubtract() {
        calculateImaginary();
        calculateRealSubtract();
        this.imaginaryPartSubtract = -1 * this.imaginaryPart;
        Complex4 root2 = new Complex4(this.realPartSubtract, this.imaginaryPartSubtract);
        return root2;
    }

    public void getRoots() {
        constructAdd();
        constructSubtract();
    }
    public String toString(){
        Complex4 root1 = constructAdd();
        Complex4 root2 = constructSubtract();
        return ("The roots are " + root1.toString() + " and " + root2.toString());
    }
    public static void main(String[] args){
        Roots testRoot1 = new Roots(3, -5, 7);
        Roots testRoot2 = new Roots(2, 6, 9);
        Roots testRoot3 = new Roots(1, -4, 4);
        System.out.println("Printing the roots of a quadratic with coefficients of 3, -5, 7");
        System.out.println(testRoot1.toString());
        System.out.println("Printing the roots of a quadratic with coefficients of 2, 6, 9");
        System.out.println(testRoot2.toString());
        System.out.println("Printing the roots of a quadratic with coefficients of 1, -4, 4");
        System.out.println(testRoot3.toString());
    }
}
