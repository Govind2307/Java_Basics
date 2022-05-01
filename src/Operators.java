public class Operators {
    public static void main(String[] args) {

    //Operators
    // There are four types of operators
    // Arithmetic
    // Assignment
    // Logical
    // Comparison


    // Arithmetic
    float a = 10;
    float b = 20;
    int sum = (int) (a + b);
    int diff = (int) (a - b);
    int mult = (int) (a * b);
    double div = a/b;
    System.out.println(sum);
    System.out.println(diff);
    System.out.println(mult);
    System.out.println(div);

    //Modulo
    double mod = a % b; // it returns the Remainder
    System.out.println(mod);




     // Assignment operator (Unary operator)

     int d = 1;
     int c = 1;
     System.out.println(d++); //1   (initial value first)
     System.out.println(d); //2  modified value later
     System.out.println(++c); // 2 modified value first
     System.out.println(c); // 2




    }
}
