
import java.util.List;
import java.util.ArrayList;

public class Statistics {

    private List<Integer> numbers = new ArrayList<>();

    public void add(int number) {
        this.numbers.add(number);
    }

    public double average() {
        return this.numbers.stream().mapToInt(i -> i).average().getAsDouble();
    }
}
