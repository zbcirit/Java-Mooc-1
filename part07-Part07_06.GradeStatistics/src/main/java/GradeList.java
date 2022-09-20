import java.util.ArrayList;

public class GradeList {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    
    public GradeList () {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public void addGrade(int grade) {
        if (grade >= 0 && grade <=100) {
            this.points.add(grade);
        }
    }
    
    public double average() {
        int sum = 0;
        for (int grade: this.points) {
            sum += grade;
        }
        return 1.0 * sum / this.points.size();
    }
    
    public double averagePassing() {
        int sum = 0;
        int count = 0;
        for (int grade:this.points) {
            if (grade >= 50) {  
                sum += grade;
                count++;
            }
        }
        if (count == 0) {
            return -1;
        }
        return 1.0 * sum / count;
    }
    
    public int numberOfPassing() {
        int count = 0;
        for (int grade:this.points) {
            if (grade >= 50) {
                count++;
            }
        }
        return count;
    }
    
    public double passPercentage() {
        return 100.0 * numberOfPassing()/ this.points.size();
    }
    
    public void pointsToGrades(){
        for (int point: points ){
            if (point < 50 ) {
                grades.add(0);
            } else if (point < 60) {
                grades.add(1);
            } else if (point < 70) {
                grades.add(2);
            } else if (point < 80) {
                grades.add(3);
            } else if (point < 90) {
                grades.add(4);
            } else {
                grades.add(5);
            }
        }
    }
    
    public String gradeDistribution() {
        this.pointsToGrades();
        int count = 5;
        String output = "";
        while (count >= 0) {
            output += count + ": ";
            for (int grade: grades) {
                if ( grade == count ){
                    output += "*";
                }
            }
            output += "\n";
            count--;
        }
        return output;
    }
    
    public void printGradeStatistics() {
        System.out.println("Point average (all): " + this.average());
        
        if (this.averagePassing() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " 
                    + this.averagePassing());
        } 
        
        System.out.println("Pass percentage: " + this.passPercentage());
        System.out.println("Grade distribution:\n" + this.gradeDistribution());
    }
    
    @Override
    public String toString() {
        return "Grades: " + this.points;
    }
    
}
