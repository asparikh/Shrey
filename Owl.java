import sun.font.TrueTypeFont;

public class Owl {
    private String name;
    private int age;
    private double weight;
    public Owl(String initName, int initAge, double initWeight) {
        this.name = initName;
        this.age = initAge;
        this.weight = initWeight;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double newWeight){
        this.weight = newWeight;
    }
    public boolean equals(Owl other) {
        if (this.name.equals(other.name) && this.age == other.age && this.weight == other.weight){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Owl Owl1 = new Owl("Hedwig", 50, 30);
        Owl Owl2 = new Owl("Hedwig", 50, 30);
        System.out.println(Owl1.equals(Owl2));
    }
}
