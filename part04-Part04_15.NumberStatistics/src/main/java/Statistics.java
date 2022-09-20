
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        this.sum = 0;
        this.count = 0;
    }
    
    public void addNumber(int number) {
        this.sum += number;
        this.count++;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if (this.count == 0) {
            return 0;
        }
        return 1.0 * this.sum / this.count;
    }
}
