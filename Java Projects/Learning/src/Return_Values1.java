public class Return_Values1 {

    // Method for integer addition
    static int plusMethodInt(int x, int y) {
        return x + y;    
    }

    // Method for double addition
    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {

        // Calling the integer method
        int myNum1 = plusMethodInt(5, 6);
        
        // Calling the double method
        double myNum2 = plusMethodDouble(5.6, 4.7);

        // Printing the results
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
