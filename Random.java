// written by parik081

public class Random {
    private int p1;
    private int p2;
    private int maximum;
    private int seed;
    private int rOld;
    public Random(int p1, int p2, int m){
        this.p1 = p1;
        this.p2 = p2;
        this.maximum = m;
        this.seed = 0;
        this.rOld = this.seed;
    }
    public void setSeed(int seed){
        this.seed = seed;
        this.rOld = this.seed;
    }
    public int getMaximum(){
        return this.maximum;
    }
    public int random(){
        int rNew;
        rNew = ((this.p1 * this.rOld) + this.p2) % this.maximum;
        this.rOld = rNew;
        return rNew;
    }
    public int randomInteger(int lower, int upper){
        if (lower > upper) { //this swaps the upper and lower values if the lower is greater than the upper
            int temp = lower;
            lower = upper;
            upper = temp;
        }
        return random() % (upper - lower + 1) + lower;
    }

    public boolean randomBoolean() {
        int bool = randomInteger(0,1);
        if (bool == 0) {
            return true;
        }
        return false;
    }

    public double randomDouble(double lower, double upper) {
        if (lower > upper) { //this swaps the upper and lower values if the lower is greater than the upper
            double temp = lower;
            lower = upper;
            upper = temp;
        }
        return ((upper - lower) * ((1.0 / this.maximum)*(randomInteger(0, this.maximum)))) + lower;
    }

    public static void main(String[] args) {
        Random rand1 = new Random(7919, 65537, 102611);
        Random rand2 = new Random(49597, 89417, 166703);
        System.out.println("The first three randomly generated numbers when using the seed value of 0 are:");
        System.out.println(rand1.random() + ", " + rand1.random() + ", " + rand1.random());
        System.out.println("The maximum is:");
        System.out.println(rand1.getMaximum());
        rand1.setSeed(15);
        System.out.println("The first three randomly generated numbers when using the seed value of 15 are:");
        System.out.println(rand1.random() + ", " + rand1.random() + ", " + rand1.random());
        rand1.setSeed(773);
        System.out.println("The first three randomly generated numbers when using the seed value of 773 are:");
        System.out.println(rand1.random() + ", " + rand1.random() + ", " + rand1.random());
        System.out.println("A sequence of randomly generated integers in the range of 1 to 5 with a sufficiently normal distribution of all possible values:");
        System.out.println(rand1.randomInteger(1,5) + ", " + rand1.randomInteger(1,5) + ", " + rand1.randomInteger(1,5) + ", " + rand1.randomInteger(1,5) + ", " + rand1.randomInteger(1,5) + ", " + rand1.randomInteger(1,5) + ", " + rand1.randomInteger(1,5) + ", " + rand1.randomInteger(1,5) + ", " + rand1.randomInteger(1,5) + ", " + rand1.randomInteger(1,5) + ", " + rand1.randomInteger(1,5) + ", " + rand1.randomInteger(1,5));
        System.out.println("A sequence of randomly generated integers in the range of 1 to 5 when the bounds have been incorrectly given in the order (5, 1) with a sufficiently normal distribution of all possible values:");
        System.out.println(rand1.randomInteger(5,1) + ", " + rand1.randomInteger(5,1) + ", " + rand1.randomInteger(5,1) + ", " + rand1.randomInteger(5,1) + ", " + rand1.randomInteger(5,1) + ", " + rand1.randomInteger(5,1) + ", " + rand1.randomInteger(5,1) + ", " + rand1.randomInteger(5,1) + ", " + rand1.randomInteger(5,1) + ", " + rand1.randomInteger(5,1) + ", " + rand1.randomInteger(5,1) + ", " + rand1.randomInteger(5,1));
        System.out.println("A sequence of randomly generated integers in the range of 10 to 30 with a sufficiently normal distribution of all possible values:");
        System.out.println(rand1.randomInteger(10,30) + ", " + rand1.randomInteger(10,30) + ", " + rand1.randomInteger(10,30) + ", " + rand1.randomInteger(10,30) + ", " + rand1.randomInteger(10,30) + ", " + rand1.randomInteger(10,30) + ", " + rand1.randomInteger(10,30) + ", " + rand1.randomInteger(10,30) + ", " + rand1.randomInteger(10,30) + ", " + rand1.randomInteger(10,30) + ", " + rand1.randomInteger(10,30) + ", " + rand1.randomInteger(10,30));
        System.out.println("A sequence of randomly generated integers in the range of 42 to 69 with a sufficiently normal distribution of all possible values:");
        System.out.println(rand1.randomInteger(42,69) + ", " + rand1.randomInteger(42,69) + ", " + rand1.randomInteger(42,69) + ", " + rand1.randomInteger(42,69) + ", " + rand1.randomInteger(42,69) + ", " + rand1.randomInteger(42,69) + ", " + rand1.randomInteger(42,69) + ", " + rand1.randomInteger(42,69) + ", " + rand1.randomInteger(42,69) + ", " + rand1.randomInteger(42,69) + ", " + rand1.randomInteger(42,69) + ", " + rand1.randomInteger(42,69));
        System.out.println("Running boolean several times with a 50% chance of getting true or false");
        System.out.println(rand1.randomBoolean() + ", " + rand1.randomBoolean() + ", " + rand1.randomBoolean() + ", " + rand1.randomBoolean() + ", " + rand1.randomBoolean() + ", " + rand1.randomBoolean() + ", " + rand1.randomBoolean() + ", " + rand1.randomBoolean() + ", " + rand1.randomBoolean() + ", " + rand1.randomBoolean() + ", " + rand1.randomBoolean());
        System.out.println("A sequence of randomly generated doubles in the range of 1.0 to 5.0 with a sufficiently normal distribution of all possible values:");
        System.out.println(rand1.randomDouble(1.0,5.0) + ", " + rand1.randomDouble(1.0,5.0) + ", " + rand1.randomDouble(1.0,5.0) + ", " + rand1.randomDouble(1.0,5.0) + ", " + rand1.randomDouble(1.0,5.0) + ", " + rand1.randomDouble(1.0,5.0) + ", " + rand1.randomDouble(1.0,5.0) + ", " + rand1.randomDouble(1.0,5.0) + ", " + rand1.randomDouble(1.0,5.0) + ", " + rand1.randomDouble(1.0,5.0) + ", " + rand1.randomDouble(1.0,5.0) + ", " + rand1.randomDouble(1.0,5.0) + ", " + rand1.randomDouble(1.0,5.0));
        System.out.println("A sequence of randomly generated doubles in the range of 1.0 to 5.0 when the bounds have been incorrectly given in the order (5.0, 1.0):");
        System.out.println(rand1.randomDouble(5.0,1.0) + ", " + rand1.randomDouble(5.0,1.0) + ", " + rand1.randomDouble(5.0,1.0) + ", " + rand1.randomDouble(5.0,1.0) + ", " + rand1.randomDouble(5.0,1.0) + ", " + rand1.randomDouble(5.0,1.0) + ", " + rand1.randomDouble(5.0,1.0) + ", " + rand1.randomDouble(5.0,1.0) + ", " + rand1.randomDouble(5.0,1.0) + ", " + rand1.randomDouble(5.0,1.0) + ", " + rand1.randomDouble(5.0,1.0) + ", " + rand1.randomDouble(5.0,1.0) + ", " + rand1.randomDouble(5.0,1.0));
    }
}
