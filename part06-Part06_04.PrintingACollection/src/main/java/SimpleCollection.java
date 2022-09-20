
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        
        String string;
        if (this.elements.size() == 1) {
            string = "The collection " + this.name + " has 1 element:";
        } else {
            string = "The collection " + this.name + " has " 
                    + this.elements.size() +  " elements:";
        }
        
        for (String element: elements) {
            string += "\n" + element;
        }
        
        return string;
    }
    
    
    
}
