import java.util.Scanner;

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

    //Comparison Operators
    // a == b;
    // a != b;
    // a < b;
    // a > b;
    // a <= b;
    // a >= b;

    // Conditional Statements
    boolean isSunUp = true;
    if(isSunUp == false)
        System.out.println("Night");
    else
        System.out.println("Day");



    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the age: ");
    int age = scan.nextInt();
    if(age >= 18)
        System.out.println("Is adult");
    else
        System.out.println("Minor");

    // Logical Operators
        // && (AND)
        int year = 2003;
        int day = 3;
     if(year>2002 && day > 1)
         System.out.println("Older");
     else
         System.out.println("Elder");

        // || (OR)
        int classes = 4;
        String sec = "A";
        if(classes>2 && sec == "B"){
            System.out.println("Older");
            System.out.println("Older");
        }
        else {
            System.out.println("Elder better");
        }



    }
}
