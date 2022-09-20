
public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    
    public Person(String initialName) {
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.name = initialName;
    }
    
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
    
    public void growOlder() {
        if (this.age < 30) {
            this.age++;
        }
    }
    
    public int getAge() {
        return this.age;
    }
    
    public boolean isOfLegalAge() {
        return this.age >= 18;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public double bodyMassIndex() {
        double heightInMeter = this.height / 100.0;
        return this.weight / (heightInMeter * heightInMeter);
    }
}
