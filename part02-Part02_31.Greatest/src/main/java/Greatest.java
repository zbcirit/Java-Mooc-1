
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int gratest = number1;
        if (number2 > gratest) {
            gratest= number2;
        }
        
        if (number3 > gratest) {
            gratest = number3;
        } 
        return gratest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
